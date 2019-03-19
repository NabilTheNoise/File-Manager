
package projecttm;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.ArrayList;


public enum DataFormats {
    _jpeg("jpeg", "Image"), _ani("ani", "Image"), _bmp("bmp", "Image"), _cal("cal", "Image"), _fax("fax", "Image"), _gif("gif", "Image"), _img("img", "Image"), _jpg("jpg", "Image"), _jpe("jpe", "Image"), _amc("amc", "Image"), _pbm("pbm", "Image"), _pcd("pcd", "Image"), _pcx("pcx", "Image"), _pct("pct", "Image"), _pgm("pgm", "Image"), _png("png", "Image"), _ppm("ppm", "Image"), _psd("psd", "Image"), _rus("rus", "Image"), _tba("tba", "Image"), _tiff("tiff", "Image"), _wmf("wmf", "Image"), _cdi("cdi", "Image"), _tif("tif", "Image"),
    //24
    _mp3("mp3", "Audio"), _wma("wma", "Audio"), _wav("wav", "Audio"), _flac("flac", "Audio"), _aac("aac", "Audio"), _midi("midi", "Audio"), _ogg("ogg", "Audio"), _aiff("aiff", "Audio"), _alac("alac", "Audio"), _av("av", "Audio"), _maa("maa", "Audio"), _muv("muv", "Audio"), _raw("raw", "Audio"), _tard("tard", "Audio"),
    //14
    _webm("webm", "Video"), _mkv("mkv", "Video"), _flv("flv", "Video"), _vob("vob", "Video"), _ogv("ogv", "Video"), _mng("mng", "Video"), _avi("avi", "Video"), _mov("mov", "Video"), _got("got", "Video"), _wmv("wmv", "Video"), _asf("asf", "Video"), _amv("amv", "Video"), _mp4("mp4", "Video"), _m4p("m4p", "Video"), _m4v("m4v", "Video"), _mpg("mpg", "Video"), _mp2("mp2", "Video"), _mpeg("mpeg", "Video"), _mpe("mpe", "Video"), _mpv("mpv", "Video"), _m2v("m2v", "Video"), _svi("svi", "Video"), _3gp("3gp", "Video"), _3g2("3g2", "Video"),
    //24
    _doc("doc", "Document"), _html("html", "Document"), _htm("htm", "Document"), _docx("docx", "Document"), _odt("odt", "Document"), _sxw("sxw", "Document"), _pdf("pdf", "Document"), _txt("txt", "Document"), _srt("srt", "Document"), _xlsx("xlsx", "Document"), _pptx("pptx", "Document"), _pptm("pptm", "Document"), _ppt("ppt", "Document"),
    //13
    _other("*", "other");
    
  private final String format;
  private final String name;

    private DataFormats(String format, String name) {
        this.format = format;
        this.name = name;
    }
    
    
    public String getDataType(){
         return name;
     }
    
    public String[] getFormats(String type, int n){
        int i = 0;
        String[] tmp = new String[n];
        for (DataFormats df : DataFormats.values()){
            if (df.getDataType().equals(type)){
                tmp[i]=(df.toString());
                i++;
                //System.out.println(df.toString() + "***");
            }       
        }
        return tmp;
    }
    
    @Override
    public String toString() {
        return  "_"  + ( format );
    }
}


