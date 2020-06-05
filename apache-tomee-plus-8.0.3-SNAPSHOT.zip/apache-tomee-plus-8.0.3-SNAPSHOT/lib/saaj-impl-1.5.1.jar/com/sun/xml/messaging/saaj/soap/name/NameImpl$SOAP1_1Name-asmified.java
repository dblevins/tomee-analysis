package asm.com.sun.xml.messaging.saaj.soap.name;
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
public class NameImpl$SOAP1_1NameDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/messaging/saaj/soap/name/NameImpl$SOAP1_1Name", null, "com/sun/xml/messaging/saaj/soap/name/NameImpl", null);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/soap/name/NameImpl$SOAP1_1Name", "com/sun/xml/messaging/saaj/soap/name/NameImpl", "SOAP1_1Name", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String", "java/lang/String"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String"});
methodVisitor.visitLdcInsn("SOAP-ENV");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String", "java/lang/String"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String", "java/lang/String"}, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/lang/String", "java/lang/String"});
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/soap/envelope/");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/name/NameImpl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}