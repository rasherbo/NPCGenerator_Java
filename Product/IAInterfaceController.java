import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.TextFlow;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.collections.ObservableList;

/**
 *
 * @author rachael
 */
public class IAInterfaceController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private CheckBox rrace;
    @FXML
    private ChoiceBox race;
    @FXML
    private CheckBox rclasss;
    @FXML
    private ChoiceBox classs;
    @FXML
    private CheckBox rage;
    @FXML
    private TextField age;
    @FXML
    private CheckBox rname;
    @FXML
    private TextField name;
    @FXML
    private CheckBox voicePrompt;
    @FXML
    private CheckBox rlevel;
    @FXML
    private ChoiceBox level;
    @FXML
    private Button create;
    @FXML
    private TextFlow view;
    
    
    @FXML
    private void create(ActionEvent event) 
    {
        NPC character = new NPC(voicePrompt.isSelected(), rrace.isSelected(), rclasss.isSelected(), rlevel.isSelected(), rage.isSelected(), rname.isSelected(), level.getValue().toString());
        if(!rrace.isSelected())
        {
            character.setRace(rage.isSelected(), (String)race.getValue());
        }
        if(!rclasss.isSelected())
        {
            character.setClass((String)classs.getValue());
        }
        if(!rage.isSelected())
        {
            character.setAge(Integer.parseInt(age.getText()));
        }
        if(!rname.isSelected())
        {
            character.setName(name.getText());
        }

        ObservableList layouts = view.getChildren();

        Text Layout1 = new Text(character.getLayout1());
        Text Layout2 = new Text(character.getLayout2());
        Text Layout3 = new Text(character.getLayout3());
        Text Layout4 = new Text(character.getLayout4());
        Text Layout5 = new Text(character.getLayout5());
        Text Layout6 = new Text(character.getLayout6());

        layouts.addAll(Layout1, Layout2, Layout3, Layout4, Layout5, Layout6);

        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        race.getItems().add("-Select Race-");
        race.setValue("-Select Race-");
        race.getItems().add("Dwarf");
        race.getItems().add("Elf");
        race.getItems().add("Halfling");
        race.getItems().add("Human");
        race.getItems().add("Dragonborn");
        race.getItems().add("Gnome");
        race.getItems().add("Half-Elf");
        race.getItems().add("Half-Orc");
        race.getItems().add("Tiefling");

        classs.getItems().add("-Select Class-");
        classs.setValue("-Select Class-");
        classs.getItems().add("Barbarian");
        classs.getItems().add("Bard");
        classs.getItems().add("Cleric");
        /* --For Future Additions--
        classs.getItems().add("Druid");
        classs.getItems().add("Fighter");
        classs.getItems().add("Monk");
        classs.getItems().add("Paladin");
        classs.getItems().add("Ranger");
        classs.getItems().add("Rogue");
        classs.getItems().add("Sorcerer");
        classs.getItems().add("Warlock");
        classs.getItems().add("Wizard");
        */

        level.getItems().add("-Select Level-");
        level.setValue("-Select Level-");
        level.getItems().add("1");
        level.getItems().add("2");
        level.getItems().add("3");
        level.getItems().add("4");
        level.getItems().add("5");
        level.getItems().add("6");
        level.getItems().add("7");
        level.getItems().add("8");
        level.getItems().add("9");
        level.getItems().add("10");
        level.getItems().add("11");
        level.getItems().add("12");
        level.getItems().add("13");
        level.getItems().add("14");
        level.getItems().add("15");
        level.getItems().add("16");
        level.getItems().add("17");
        level.getItems().add("18");
        level.getItems().add("19");
        level.getItems().add("20");

        rrace.setSelected(true);
        rclasss.setSelected(true);
        rage.setSelected(true);
        rname.setSelected(true);
        voicePrompt.setSelected(true);
        rlevel.setSelected(true);
    }    
    
}
