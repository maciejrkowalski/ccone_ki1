package pl.zlapkontakt.ccone_1.ccone_ki1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.SurveyForm;
import pl.zlapkontakt.ccone_1.ccone_ki1.TransactionalEmailSender;

import java.io.File;

@Controller

public class SurveyController {

    @RequestMapping(value = "/2AYETlLbdDZ98wBSSltlX8pjxM9QmIvcLA2SUYJTEVofsyTA7BWbrbceMxQta4SdG38S5F2iPBRVpXuMtBqFuzZw6nwwGqfQggjlsazlE2TSze3bw", method = RequestMethod.GET)

    public String getSurveyForm() {
        return "2AYETlLbdDZ98wBSSltlX8pjxM9QmIvcLA2SUYJTEVofsyTA7BWbrbceMxQta4SdG38S5F2iPBRVpXuMtBqFuzZw6nwwGqfQggjlsazlE2TSze3bw";
    }

    @RequestMapping(value = "/2AYETlLbdDZ98wBSSltlX8pjxM9QmIvcLA2SUYJTEVofsyTA7BWbrbceMxQta4SdG38S5F2iPBRVpXuMtBqFuzZw6nwwGqfQggjlsazlE2TSze3bw", method = {RequestMethod.POST})
    public String surveyForm(@ModelAttribute(name = "surveyForm") SurveyForm surveyForm, Model model) {

        String NIP = surveyForm.getNIP();
        String company = surveyForm.getCompany();
        String contactPersonFname = surveyForm.getContactPersonFname();
        String contactPersonLname = surveyForm.getContactPersonLname();
        String tel = surveyForm.getTel();
        String email = surveyForm.getEmail();
        String obligationValue = surveyForm.getObligationValue();
        String payDate = surveyForm.getPayDate();
        String contactDate = surveyForm.getContactDate();
        String objections = surveyForm.getObjections();
        String additionalContent = surveyForm.getAdditionalContent();
        String consultantName = surveyForm.getConsultantName();
        String document = surveyForm.getDocument();


//        DAO.addReportToDb("consultantName", NIP, company, contactPersonFname, contactPersonLname, tel, email, obligationValue, payDate, contactDate, objections, additionalContent, document);

//        System.out.println(NIP);

        try {
            File htmlInput = new File("K:\\Dropbox\\Dropbox\\moje\\moje aplikacje\\ccone_ki1\\src\\main\\resources\\templates\\mail.html");
            String emailBody = org.apache.commons.io.FileUtils.readFileToString(htmlInput, "UTF-8");
            emailBody = emailBody.replaceAll("%NIP%", NIP);
            emailBody = emailBody.replaceAll("%company%", company);
            emailBody = emailBody.replaceAll("%contactPersonFname%", contactPersonFname);
            emailBody = emailBody.replaceAll("%contactPersonLname%", contactPersonLname);
            emailBody = emailBody.replaceAll("%tel%", tel);
            emailBody = emailBody.replaceAll("%email%", email);
            emailBody = emailBody.replaceAll("%obligationValue%", obligationValue);
            emailBody = emailBody.replaceAll("%payDate%", payDate);
            emailBody = emailBody.replaceAll("%contactDate%", contactDate);
            if (objections.length() > 0) {
                emailBody = emailBody.replaceAll("%objections%", objections);
            } else {
                emailBody = emailBody.replaceAll("%objections%", "brak");
            }
            if (additionalContent.length() > 0) {
                emailBody = emailBody.replaceAll("%additionalContent%", additionalContent);
            } else {
                emailBody = emailBody.replaceAll("%additionalContent%", "brak");
            }
            emailBody = emailBody.replaceAll("%consultantName%", consultantName);
            emailBody = emailBody.replaceAll("%document%", document);


            TransactionalEmailSender.sendEmail("m.kowalski@zikom.pl", "Nowy raport z kontaktu z Klientem KRD", emailBody);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "sent";
    }


}
