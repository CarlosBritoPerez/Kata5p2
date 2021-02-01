package view;

import java.util.List;
import model.Mail;
import model.Histogram;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histogram = new Histogram();
        list.forEach(element -> {
            histogram.increment(element.getDomain());
        });
        
        return histogram;
    }
}
