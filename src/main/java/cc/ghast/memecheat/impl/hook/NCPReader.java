package cc.ghast.memecheat.impl.hook;

import cc.ghast.memecheat.MemeCheat;
import cc.ghast.memecheat.api.data.PlayerData;
import fr.neatmonster.nocheatplus.NCPAPIProvider;
import fr.neatmonster.nocheatplus.checks.CheckType;
import fr.neatmonster.nocheatplus.checks.access.IViolationInfo;
import fr.neatmonster.nocheatplus.components.registry.feature.NCPListener;
import fr.neatmonster.nocheatplus.hooks.NCPHook;
import fr.neatmonster.nocheatplus.hooks.NCPHookManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import javax.xml.bind.Marshaller;

public class NCPReader implements NCPHook {

    public String getHookName(){
        return "MemeCheat Listener";
    }
    public String getHookVersion(){
        return "0.1-SNAPSHOT";
    }
    public NCPReader() {
        NCPHookManager.addHook(CheckType.ALL, this);
    }

    public boolean onCheckFailure(CheckType check, Player player, IViolationInfo vl){
        PlayerData data = MemeCheat.getInstance().getApi().getPlayerDataManager().getData(player);
        //data.addViolation();
        return false;
    }
}
