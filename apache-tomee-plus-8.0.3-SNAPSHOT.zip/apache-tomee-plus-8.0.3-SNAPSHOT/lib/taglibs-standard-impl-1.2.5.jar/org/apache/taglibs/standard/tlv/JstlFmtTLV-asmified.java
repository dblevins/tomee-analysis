package asm.org.apache.taglibs.standard.tlv;
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
public class JstlFmtTLVDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/taglibs/standard/tlv/JstlFmtTLV", null, "org/apache/taglibs/standard/tlv/JstlBaseTLV", null);

classWriter.visitInnerClass("org/apache/taglibs/standard/tlv/JstlFmtTLV$1", "org/apache/taglibs/standard/tlv/JstlFmtTLV", null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/taglibs/standard/tlv/JstlFmtTLV$Handler", "org/apache/taglibs/standard/tlv/JstlFmtTLV", "Handler", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SETLOCALE", "Ljava/lang/String;", null, "setLocale");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SETBUNDLE", "Ljava/lang/String;", null, "setBundle");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SETTIMEZONE", "Ljava/lang/String;", null, "setTimeZone");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BUNDLE", "Ljava/lang/String;", null, "bundle");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MESSAGE", "Ljava/lang/String;", null, "message");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MESSAGE_PARAM", "Ljava/lang/String;", null, "param");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FORMAT_NUMBER", "Ljava/lang/String;", null, "formatNumber");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PARSE_NUMBER", "Ljava/lang/String;", null, "parseNumber");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PARSE_DATE", "Ljava/lang/String;", null, "parseDate");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "JSP_TEXT", "Ljava/lang/String;", null, "jsp:text");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "EVAL", "Ljava/lang/String;", null, "evaluator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MESSAGE_KEY", "Ljava/lang/String;", null, "key");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "BUNDLE_PREFIX", "Ljava/lang/String;", null, "prefix");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VALUE", "Ljava/lang/String;", null, "value");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tlv/JstlBaseTLV", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validate", "(Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/jsp/tagext/PageData;)[Ljavax/servlet/jsp/tagext/ValidationMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tlv/JstlBaseTLV", "validate", "(ILjava/lang/String;Ljava/lang/String;Ljavax/servlet/jsp/tagext/PageData;)[Ljavax/servlet/jsp/tagext/ValidationMessage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getHandler", "()Lorg/xml/sax/helpers/DefaultHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/taglibs/standard/tlv/JstlFmtTLV$Handler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/taglibs/standard/tlv/JstlFmtTLV$Handler", "<init>", "(Lorg/apache/taglibs/standard/tlv/JstlFmtTLV;Lorg/apache/taglibs/standard/tlv/JstlFmtTLV$1;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
