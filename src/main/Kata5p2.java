package main;

import java.io.IOException;
import view.HistogramDisplay;
import model.Histogram;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mail;
import view.MailListReader;

public class Kata5p2 {

    public static void main(String[] args) {
        
        Kata5p2 histograma = new Kata5p2();
        try {
            histograma.execute();
        } catch (IOException ex) {
            Logger.getLogger(Kata5p2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private List<Mail> list;
    private Histogram<String> histogram;
    
    private void execute() throws IOException {
        input();
        process();
        output();
    }
    
    private void input() throws IOException {
        list = MailListReader.read("email.txt");
    }
    
    private void process() throws IOException {
        histogram = view.MailHistogramBuilder.build(list);
    }
    
    private void output() throws IOException {
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM", histogram);
        histo.execute();
    }
}


