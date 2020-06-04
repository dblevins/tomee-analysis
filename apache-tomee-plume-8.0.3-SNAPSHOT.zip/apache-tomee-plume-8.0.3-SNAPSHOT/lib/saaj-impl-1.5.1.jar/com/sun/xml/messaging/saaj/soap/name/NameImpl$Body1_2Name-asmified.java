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
public class NameImpl$Body1_2NameDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/messaging/saaj/soap/name/NameImpl$Body1_2Name", null, "com/sun/xml/messaging/saaj/soap/name/NameImpl$SOAP1_2Name", null);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/soap/name/NameImpl$Body1_2Name", "com/sun/xml/messaging/saaj/soap/name/NameImpl", "Body1_2Name", ACC_STATIC);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/soap/name/NameImpl$SOAP1_2Name", "com/sun/xml/messaging/saaj/soap/name/NameImpl", "SOAP1_2Name", ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Body");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/soap/name/NameImpl$SOAP1_2Name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
