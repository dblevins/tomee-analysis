package asm.jakarta.xml.bind.util;
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
public class JAXBResultDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/xml/bind/util/JAXBResult", null, "javax/xml/transform/sax/SAXResult", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "unmarshallerHandler", "Ljakarta/xml/bind/UnmarshallerHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/xml/bind/JAXBContext;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/JAXBResult", "assertionFailed", "()Ljakarta/xml/bind/Unmarshaller;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.UNINITIALIZED_THIS});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/bind/JAXBContext", "createUnmarshaller", "()Ljakarta/xml/bind/Unmarshaller;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/JAXBContext"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/Unmarshaller"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/util/JAXBResult", "<init>", "(Ljakarta/xml/bind/Unmarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/xml/bind/Unmarshaller;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/sax/SAXResult", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXBResult.NullUnmarshaller");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"jakarta/xml/bind/util/JAXBResult", "jakarta/xml/bind/Unmarshaller"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/bind/Unmarshaller", "getUnmarshallerHandler", "()Ljakarta/xml/bind/UnmarshallerHandler;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/bind/util/JAXBResult", "unmarshallerHandler", "Ljakarta/xml/bind/UnmarshallerHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/bind/util/JAXBResult", "unmarshallerHandler", "Ljakarta/xml/bind/UnmarshallerHandler;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/sax/SAXResult", "setHandler", "(Lorg/xml/sax/ContentHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getResult", "()Ljava/lang/Object;", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/bind/util/JAXBResult", "unmarshallerHandler", "Ljakarta/xml/bind/UnmarshallerHandler;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/xml/bind/UnmarshallerHandler", "getResult", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "assertionFailed", "()Ljakarta/xml/bind/Unmarshaller;", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXBResult.NullContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
