package asm.org.apache.myfaces.shared.renderkit.html;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class HTMLDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/myfaces/shared/renderkit/html/HTML", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALIGN_ATTR", "Ljava/lang/String;", null, "align");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BORDER_ATTR", "Ljava/lang/String;", null, "border");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIDTH_ATTR", "Ljava/lang/String;", null, "width");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READONLY_ATTR", "Ljava/lang/String;", null, "readonly");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FILE_ATTR", "Ljava/lang/String;", null, "file");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCEPT_ATTR", "Ljava/lang/String;", null, "accept");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONCLICK_ATTR", "Ljava/lang/String;", null, "onclick");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONDBLCLICK_ATTR", "Ljava/lang/String;", null, "ondblclick");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONMOUSEDOWN_ATTR", "Ljava/lang/String;", null, "onmousedown");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONMOUSEUP_ATTR", "Ljava/lang/String;", null, "onmouseup");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONMOUSEOVER_ATTR", "Ljava/lang/String;", null, "onmouseover");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONMOUSEMOVE_ATTR", "Ljava/lang/String;", null, "onmousemove");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONMOUSEOUT_ATTR", "Ljava/lang/String;", null, "onmouseout");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONKEYPRESS_ATTR", "Ljava/lang/String;", null, "onkeypress");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONKEYDOWN_ATTR", "Ljava/lang/String;", null, "onkeydown");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONKEYUP_ATTR", "Ljava/lang/String;", null, "onkeyup");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONFOCUS_ATTR", "Ljava/lang/String;", null, "onfocus");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONBLUR_ATTR", "Ljava/lang/String;", null, "onblur");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EVENT_HANDLER_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONSELECT_ATTR", "Ljava/lang/String;", null, "onselect");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONCHANGE_ATTR", "Ljava/lang/String;", null, "onchange");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_EVENT_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONFOCUS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONSELECT_AND_ONCHANGE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIR_ATTR", "Ljava/lang/String;", null, "dir");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANG_ATTR", "Ljava/lang/String;", null, "lang");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STYLE_ATTR", "Ljava/lang/String;", null, "style");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TITLE_ATTR", "Ljava/lang/String;", null, "title");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STYLE_CLASS_ATTR", "Ljava/lang/String;", null, "styleClass");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROLE_ATTR", "Ljava/lang/String;", null, "role");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE_AND_TITLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS_ATTR", "Ljava/lang/String;", null, "class");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCESSKEY_ATTR", "Ljava/lang/String;", null, "accesskey");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABINDEX_ATTR", "Ljava/lang/String;", null, "tabindex");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DISABLED_ATTR", "Ljava/lang/String;", null, "disabled");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK_WITHOUT_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS_AND_ONCLICK", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONCLICK", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_ATTR", "Ljava/lang/String;", null, "target");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHARSET_ATTR", "Ljava/lang/String;", null, "charset");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COORDS_ATTR", "Ljava/lang/String;", null, "coords");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HREF_ATTR", "Ljava/lang/String;", null, "href");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HREFLANG_ATTR", "Ljava/lang/String;", null, "hreflang");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REL_ATTR", "Ljava/lang/String;", null, "rel");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REV_ATTR", "Ljava/lang/String;", null, "rev");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHAPE_ATTR", "Ljava/lang/String;", null, "shape");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_ATTR", "Ljava/lang/String;", null, "type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_ONCLICK_WITHOUT_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_STYLE_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_ATTRIBUTES_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_PASSTHROUGH_ATTRIBUTES_DISABLED_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACCEPT_CHARSET_ATTR", "Ljava/lang/String;", null, "accept-charset");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCTYPE_ATTR", "Ljava/lang/String;", null, "enctype");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONRESET_ATTR", "Ljava/lang/String;", null, "onreset");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONSUMBIT_ATTR", "Ljava/lang/String;", null, "onsubmit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORM_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORM_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORM_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SRC_ATTR", "Ljava/lang/String;", null, "src");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALT_ATTR", "Ljava/lang/String;", null, "alt");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEIGHT_ATTR", "Ljava/lang/String;", null, "height");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HSPACE_ATTR", "Ljava/lang/String;", null, "hspace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISMAP_ATTR", "Ljava/lang/String;", null, "ismap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONGDESC_ATTR", "Ljava/lang/String;", null, "longdesc");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "USEMAP_ATTR", "Ljava/lang/String;", null, "usemap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VSPACE_ATTR", "Ljava/lang/String;", null, "vspace");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMG_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMG_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMG_PASSTHROUGH_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMG_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIZE_ATTR", "Ljava/lang/String;", null, "size");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTOCOMPLETE_ATTR", "Ljava/lang/String;", null, "autocomplete");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHECKED_ATTR", "Ljava/lang/String;", null, "checked");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAXLENGTH_ATTR", "Ljava/lang/String;", null, "maxlength");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS_AND_ONCLICK", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_SUBMIT", "Ljava/lang/String;", null, "submit");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_IMAGE", "Ljava/lang/String;", null, "image");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_HIDDEN", "Ljava/lang/String;", null, "hidden");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_CHECKBOX", "Ljava/lang/String;", null, "checkbox");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_PASSWORD", "Ljava/lang/String;", null, "password");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_TEXT", "Ljava/lang/String;", null, "text");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_RADIO", "Ljava/lang/String;", null, "radio");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_BUTTON", "Ljava/lang/String;", null, "button");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_TYPE_FILE", "Ljava/lang/String;", null, "file");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BUTTON_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BUTTON_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BUTTON_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONCLICK", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BUTTON_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FRAMEBORDER_ATTR", "Ljava/lang/String;", null, "frameborder");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCROLLING_ATTR", "Ljava/lang/String;", null, "scrolling");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOR_ATTR", "Ljava/lang/String;", null, "for");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LABEL_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LABEL_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LABEL_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LABEL_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTIPLE_ATTR", "Ljava/lang/String;", null, "multiple");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BGCOLOR_ATTR", "Ljava/lang/String;", null, "bgcolor");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CELLPADDING_ATTR", "Ljava/lang/String;", null, "cellpadding");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CELLSPACING_ATTR", "Ljava/lang/String;", null, "cellspacing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FRAME_ATTR", "Ljava/lang/String;", null, "frame");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RULES_ATTR", "Ljava/lang/String;", null, "rules");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUMMARY_ATTR", "Ljava/lang/String;", null, "summary");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLS_ATTR", "Ljava/lang/String;", null, "cols");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ROWS_ATTR", "Ljava/lang/String;", null, "rows");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRAP_ATTR", "Ljava/lang/String;", null, "wrap");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEXTAREA_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEXTAREA_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEXTAREA_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_FILE_UPLOAD_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_FILE_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_FILE_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_PASSTHROUGH_ATTRIBUTES_WITHOUT_TITLE_STYLE_AND_STYLE_CLASS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_TABLE_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPACT_ATTR", "Ljava/lang/String;", null, "compact");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UL_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UL_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UL_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HEAD_ELEM", "Ljava/lang/String;", null, "head");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_ELEM", "Ljava/lang/String;", null, "body");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_TARGET", "Ljava/lang/String;", null, "body");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONLOAD_ATTR", "Ljava/lang/String;", null, "onload");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONUNLOAD_ATTR", "Ljava/lang/String;", null, "onunload");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALINK_ATTR", "Ljava/lang/String;", null, "alink");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VLINK_ATTR", "Ljava/lang/String;", null, "vlink");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LINK_ATTR", "Ljava/lang/String;", null, "link");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEXT_ATTR", "Ljava/lang/String;", null, "text");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BACKGROUND_ATTR", "Ljava/lang/String;", null, "background");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BODY_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ID_ATTR", "Ljava/lang/String;", null, "id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAME_ATTR", "Ljava/lang/String;", null, "name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_ATTR", "Ljava/lang/String;", null, "value");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD_ATTR", "Ljava/lang/String;", null, "method");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_ATTR", "Ljava/lang/String;", null, "action");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COLSPAN_ATTR", "Ljava/lang/String;", null, "colspan");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_ATTR", "Ljava/lang/String;", null, "scope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LABEL_ATTR", "Ljava/lang/String;", null, "label");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECTED_ATTR", "Ljava/lang/String;", null, "selected");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLNS_ATTR", "Ljava/lang/String;", null, "xmlns");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_COLGROUP_VALUE", "Ljava/lang/String;", null, "colgroup");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCOPE_ROW_VALUE", "Ljava/lang/String;", null, "row");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPAN_ELEM", "Ljava/lang/String;", null, "span");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIV_ELEM", "Ljava/lang/String;", null, "div");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INPUT_ELEM", "Ljava/lang/String;", null, "input");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BUTTON_ELEM", "Ljava/lang/String;", null, "button");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SELECT_ELEM", "Ljava/lang/String;", null, "select");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTION_ELEM", "Ljava/lang/String;", null, "option");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTGROUP_ELEM", "Ljava/lang/String;", null, "optgroup");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TEXTAREA_ELEM", "Ljava/lang/String;", null, "textarea");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FORM_ELEM", "Ljava/lang/String;", null, "form");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANCHOR_ELEM", "Ljava/lang/String;", null, "a");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "H1_ELEM", "Ljava/lang/String;", null, "h1");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "H2_ELEM", "Ljava/lang/String;", null, "h2");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "H3_ELEM", "Ljava/lang/String;", null, "h3");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "H4_ELEM", "Ljava/lang/String;", null, "h4");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "H5_ELEM", "Ljava/lang/String;", null, "h5");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "H6_ELEM", "Ljava/lang/String;", null, "h6");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IFRAME_ELEM", "Ljava/lang/String;", null, "iframe");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IMG_ELEM", "Ljava/lang/String;", null, "img");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LABEL_ELEM", "Ljava/lang/String;", null, "label");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_ELEM", "Ljava/lang/String;", null, "table");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CAPTION_ELEM", "Ljava/lang/String;", null, "caption");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TR_ELEM", "Ljava/lang/String;", null, "tr");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TH_ELEM", "Ljava/lang/String;", null, "th");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TD_ELEM", "Ljava/lang/String;", null, "td");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TBODY_ELEM", "Ljava/lang/String;", null, "tbody");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TFOOT_ELEM", "Ljava/lang/String;", null, "tfoot");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "THEAD_ELEM", "Ljava/lang/String;", null, "thead");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STYLE_ELEM", "Ljava/lang/String;", null, "style");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCRIPT_ELEM", "Ljava/lang/String;", null, "script");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCRIPT_TYPE_ATTR", "Ljava/lang/String;", null, "type");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCRIPT_TYPE_TEXT_JAVASCRIPT", "Ljava/lang/String;", null, "text/javascript");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STYLE_TYPE_TEXT_CSS", "Ljava/lang/String;", null, "text/css");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCRIPT_LANGUAGE_ATTR", "Ljava/lang/String;", null, "language");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCRIPT_LANGUAGE_JAVASCRIPT", "Ljava/lang/String;", null, "JavaScript");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SCRIPT_ELEM_DEFER_ATTR", "Ljava/lang/String;", null, "defer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LINK_ELEM", "Ljava/lang/String;", null, "link");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STYLESHEET_VALUE", "Ljava/lang/String;", null, "stylesheet");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UL_ELEM", "Ljava/lang/String;", null, "ul");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OL_ELEM", "Ljava/lang/String;", null, "ol");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LI_ELEM", "Ljava/lang/String;", null, "li");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BR_ELEM", "Ljava/lang/String;", null, "br");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NBSP_ENTITY", "Ljava/lang/String;", null, "&#160;");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HREF_PATH_SEPARATOR", "Ljava/lang/String;", null, "/");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HREF_PATH_FROM_PARAM_SEPARATOR", "Ljava/lang/String;", null, "?");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HREF_PARAM_NAME_FROM_VALUE_SEPARATOR", "Ljava/lang/String;", null, "=");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("onmouseover");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("onmouseout");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("ondblclick");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onmousedown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("onmouseup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("onmousemove");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("onkeypress");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("onkeydown");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("onkeyup");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("onclick");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("onselect");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("onchange");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onselect");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("onchange");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONFOCUS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONSELECT_AND_ONCHANGE", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("title");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("role");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE_AND_TITLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("tabindex");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("disabled");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONFOCUS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONFOCUS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS_AND_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("charset");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("coords");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("hreflang");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("rel");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("rev");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("shape");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("tabindex");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("target");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONSELECT_AND_ONCHANGE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONSELECT_AND_ONCHANGE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONCLICK_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONSELECT_AND_ONCHANGE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_ONCLICK_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES_WITHOUT_STYLE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES_WITHOUT_STYLE_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("tabindex");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_EVENT_ATTRIBUTES_WITHOUT_ONSELECT_AND_ONCHANGE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_ATTRIBUTES_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "ANCHOR_PASSTHROUGH_ATTRIBUTES_DISABLED_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accept");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("accept-charset");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("enctype");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("onreset");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("onsubmit");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("target");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "FORM_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "FORM_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "FORM_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "FORM_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "FORM_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("align");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("alt");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("border");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("height");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("hspace");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("ismap");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("longdesc");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("usemap");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("vspace");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("width");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_PASSTHROUGH_ATTRIBUTES_WITHOUT_ONMOUSEOVER_AND_ONMOUSEOUT", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "IMG_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("align");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("alt");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("checked");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("maxlength");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("readonly");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("size");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS_AND_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONFOCUS_AND_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_STYLE_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("align");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("alt");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_ONCLICK", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BUTTON_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onblur");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("onfocus");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "LABEL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accesskey");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "LABEL_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "LABEL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "LABEL_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "LABEL_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "LABEL_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "SELECT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "SELECT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("align");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("bgcolor");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("border");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("cellpadding");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("cellspacing");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("frame");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("rules");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("summary");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("width");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TABLE_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TABLE_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TABLE_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TABLE_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TABLE_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("cols");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("readonly");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("rows");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("wrap");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TEXTAREA_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TEXTAREA_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TEXTAREA_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TEXTAREA_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_FIELD_PASSTROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "TEXTAREA_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("accept");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_FILE_UPLOAD_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_FILE_UPLOAD_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_FILE_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_FILE_UPLOAD_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "INPUT_FILE_PASSTHROUGH_ATTRIBUTES_WITHOUT_DISABLED_AND_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("dir");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "EVENT_HANDLER_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "MESSAGE_PASSTHROUGH_ATTRIBUTES_WITHOUT_TITLE_STYLE_AND_STYLE_CLASS", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("style");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("styleClass");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("border");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "SELECT_TABLE_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("compact");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UL_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UL_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("onload");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("onunload");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("alink");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("vlink");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("link");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("text");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("background");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("bgcolor");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BODY_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("alink");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("vlink");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("link");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("text");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("background");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("bgcolor");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BODY_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "COMMON_PASSTROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BODY_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BODY_PASSTHROUGH_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "UNIVERSAL_ATTRIBUTES", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BODY_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ArrayUtils", "concat", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/myfaces/shared/renderkit/html/HTML", "BODY_PASSTHROUGH_ATTRIBUTES_WITHOUT_EVENTS", "[Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
