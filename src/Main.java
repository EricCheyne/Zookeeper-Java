import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the number of the habitat you would like to view or 'exit' to end the program:");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            try {
                int habitatNumber = Integer.parseInt(input);

                switch (habitatNumber) {
                    case 0:
                        System.out.println("""
                            Switching on the camera in the camel habitat...
                             ___.-''''-.
                            /___  @    |
                            ',,,,.     |         _.'''''''._
                                 '     |        /           \\
                                 |     \\    _.-'             \\
                                 |      '.-'                  '-.
                                 |                               ',
                                 |                                '',
                                  ',,-,                           ':;
                                       ',,| ;,,                 ,' ;;
                                          ! ; !'',,,',',,,,'!  ;   ;:
                                         : ;  ! !       ! ! ;  ;   :;
                                         ; ;   ! !      ! !  ; ;   ;,
                                        ; ;    ! !     ! !   ; ;
                                        ; ;    ! !    ! !     ; ;
                                       ;,,      !,!   !,!     ;,;
                                       /_I      L_I   L_I     /_I
                            Look at that! Our little camel is sunbathing!""");
                        break;
                    case 1:
                        System.out.println("""
                            Switching on the camera in the lion habitat...
                                                           ,w.
                                                         ,YWMMw  ,M  ,
                                    _.---.._   __..---._.'MMMMMw,wMWmW,
                               _.-""        '''           YP"WMMMMMMMMMb,
                            .-' __.'                   .'     MMMMW^WMMMM;
                _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
             ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\\
            ,MM:.    .'.-'   .'     ;     `\\    ;     `,     MMMMMMMW `"=./`-,
            WMMm__,-'.'     /      _.\\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
            "^MP__.-'    ,-' _.--""   `-,   ;       \\  ; ;MMMMMMMMMMW^``; __|
                       /   .'            ; ;         )  )`{  \\ `"^W^`,   \\  :
                      /  .'             /  (       .'  /     Ww._     `.  `"
                     /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
                    (--, )                `,_ / `) \\/"")      ^"      `-, -;"\\:
            The lion is roaring!""");
                        break;
                    case 2:
                        System.out.println("""
                            Switching on the camera in the deer habitat...
                               /|       |\\
                            `__\\       //__'
                               ||      ||
                             \\__`\\     |'__/
                               `_\\   //_'
                               _.,:---;,._
                               \\_:     :_/
                                 |@. .@|
                                 |     |
                                 ,\\.-./ \\
                                 ;;`-'   `---__________-----.-.
                                 ;;;                         \\_\\
                                 ';;;                         |
                                  ;    |                      ;
                                   \\   \\     \\        |      /
                                    \\_, \\    /        \\     |\\
                                      |';|  |,,,,,,,,/ \\    \\ \\_
                                      |  |  |           \\   /   |
                                      \\  \\  |           |  / \\  |
                                       | || |           | |   | |
                                       | || |           | |   | |
                                       | || |           | |   | |
                                       |_||_|           |_|   |_|
                                      /_//_/           /_/   /_/
                            Our 'Bambi' looks hungry. Let's go to feed it!""");
                        break;
                    case 3:
                        System.out.println("""
            Switching on the camera in the goose habitat...
                                                _
                                            ,-"" "".
                                          ,'  ____  `.
                                        ,'  ,'    `.  `._
               (`.         _..--.._   ,'  ,'        \\    \\
              (`-.\\    .-""        ""'   /          (  d _b
             (`._  `-"" ,._             (            `-(   \\
             <_  `     (  <`<            \\              `-._\\
              <`-       (__< <           :
               (__        (_<_<          ;
                `------------------------------------------
            The goose is staring intently at you... Maybe it's time to change the channel?""");
                        break;
                    case 4:
                        System.out.println("""
                            Switching on the camera in the bat habitat...
                            _________________               _________________
                             ~-.              \\  |\\___/|  /              .-~
                                 ~-.           \\ / o o \\ /           .-~
                                    >           \\  W  //           <
                                   /             /~---~\\             \\
                                  /_            |       |            _\\
                                     ~-.        |       |        .-~
                                        ;        \\     /        i
                                       /___      /\\   /\\      ___\\
                                            ~-. /  \\_/  \\ .-~
                                               V         V
                            This bat looks like it's doing fine.""");
                        break;
                    case 5:
                        System.out.println("""
                            Switching on the camera in the rabbit habitat...
                                     ,
                                    /|      __
                                   / |   ,-~ /
                                  Y :|  //  /
                                  | jj /( .^
                                  >-"~"-v"
                                 /       Y
                                jo  o    |
                               ( ~T~     j
                                >._-' _./
                               /   "~"  |
                              Y     _,  |
                             /| ;-"~ _  l
                            / l/ ,-"~    \\
                            \\//\\/      .- \\
                             Y        /    Y
                             l       I     !
                             ]\\      _\\    /"\\
                            (" ~----( ~   Y.  )
                            It looks like we will soon have more rabbits!""");
                        break;
                    default:
                        System.out.println("Invalid habitat number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'exit' to end the program.");
            }
        }

        System.out.println("See you later!");
    }
}
