package br.com.www.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String title;
    private String description;
    private LocalDateTime dateTime;
    private String city;

    public Event(String title, String description, LocalDateTime dateTime, String city) {
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public String getCity() {
        return city;
    }

    public String getDateTimeString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return dateTime.format(dateTimeFormatter);
    }

    public boolean alreadyHappened() {
        if (dateTime.isBefore(LocalDateTime.now())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String titleCPW = "Campus Party Weekend";
        String descriptionCPW = """
                Aracaju receberá, pela primeira vez, a Campus Party Weekend, um dos maiores eventos globais de
                tecnologia, inovação, ciência e empreendedorismo. A edição, que acontece nos dias 25 e 26 de
                outubro no campus da Universidade Tiradentes (Unit/Farolândia), promete reunir milhares de
                pessoas, entre estudantes, pesquisadores, startups, criadores de conteúdo e profissionais
                do setor, em uma verdadeira imersão no tecnológica.""";
        LocalDateTime dateTimeCPW = LocalDateTime.of(2025,10,25, 8,10);
        String cityCPW = "Aracaju";
        Event campusPartyWeekend = new Event(titleCPW, descriptionCPW, dateTimeCPW, cityCPW);

        System.out.println();
        System.out.printf("""
                -------------------------------------------
                 Date and time of event: %s
                 Today's date and time: %s
                 Event has already taken place: %b
                -------------------------------------------""",
                campusPartyWeekend.getDateTimeString(),
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")),
                campusPartyWeekend.alreadyHappened());

        String titleWSR = "Web Summit Rio";
        String descriptionWSR = """
                  Web Summit Rio connects a new generation of founders from Brazil and across Latin
                America with investors, journalists, and technology leaders from around the world.
                  Web Summit Rio is part of the roster of international events organized by Web Summit,
                taking to the world stage alongside Web Summit in Lisbon, Web Summit Qatar in Doha, Web
                Summit Vancouver in Canada, and RISE in Asia.""";
        LocalDateTime dateTimeWSR = LocalDateTime.of(2026,6,8, 10,0);
        String cityWSR = "Rio de Janeiro";
        Event webSummitRio = new Event(titleWSR, descriptionWSR, dateTimeWSR, cityWSR);

        System.out.println();
        System.out.printf("""
                -------------------------------------------
                Date and time of event: %s
                Today's date and time: %s
                Event has already taken place: %b
                -------------------------------------------""",
                webSummitRio.getDateTimeString(),
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")),
                webSummitRio.alreadyHappened());

    }
}

/*
Você trabalha em uma agência de turismo e é responsável pelo agendamento de eventos como passeios e excursões.
    Para garantir uma boa organização, o sistema precisa verificar se um evento já ocorreu ou ainda está por
    vir combase na data atual.

Crie um programa que:

    1. Receba uma data de evento previamente cadastrada.
    2. Compare essa data com a data atual.
    3. Exiba a data do evento e a data atual no formato dd-MM-yyyy.
    4. Informe se o evento já ocorreu ou ainda está por vir.


Saída esperada (Se a data do evento for 10 de março de 2025 e a data atual for 15 de março de 2025):

    Data do evento: 10-03-2025
    Data atual: 15-03-2025
    O evento já ocorreu.

 */
