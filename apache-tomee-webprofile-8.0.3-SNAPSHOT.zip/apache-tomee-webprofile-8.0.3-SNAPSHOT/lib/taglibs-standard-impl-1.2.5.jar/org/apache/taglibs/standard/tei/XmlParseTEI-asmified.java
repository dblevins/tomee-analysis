package asm.org.apache.taglibs.standard.tei;
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
public class XmlParseTEIDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/taglibs/standard/tei/XmlParseTEI", null, "jakarta/servlet/jsp/tagext/TagExtraInfo", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VAR", "Ljava/lang/String;", null, "var");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VAR_DOM", "Ljava/lang/String;", null, "varDom");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SCOPE", "Ljava/lang/String;", null, "scope");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SCOPE_DOM", "Ljava/lang/String;", null, "scopeDom");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/jsp/tagext/TagExtraInfo", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isValid", "(Ljakarta/servlet/jsp/tagext/TagData;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("var");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("varDom");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("var");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("varDom");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("scope");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("var");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("scopeDom");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("varDom");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/taglibs/standard/tei/Util", "isSpecified", "(Ljakarta/servlet/jsp/tagext/TagData;Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
