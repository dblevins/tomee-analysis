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
public class JAXBSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "jakarta/xml/bind/util/JAXBSource", null, "javax/xml/transform/sax/SAXSource", null);

classWriter.visitInnerClass("jakarta/xml/bind/util/JAXBSource$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "marshaller", "Ljakarta/xml/bind/Marshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "contentObject", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pseudoParser", "Lorg/xml/sax/XMLReader;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/xml/bind/JAXBContext;Ljava/lang/Object;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("JAXBSource.NullContext");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/JAXBSource", "assertionFailed", "(Ljava/lang/String;)Ljakarta/xml/bind/Marshaller;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.UNINITIALIZED_THIS});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/bind/JAXBContext", "createMarshaller", "()Ljakarta/xml/bind/Marshaller;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/JAXBContext", "java/lang/Object"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/Marshaller"});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitLdcInsn("JAXBSource.NullContent");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/JAXBSource", "assertionFailed", "(Ljava/lang/String;)Ljakarta/xml/bind/Marshaller;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/JAXBContext", "java/lang/Object"}, 2, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/Marshaller"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/JAXBContext", "java/lang/Object"}, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "jakarta/xml/bind/Marshaller", "java/lang/Object"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/util/JAXBSource", "<init>", "(Ljakarta/xml/bind/Marshaller;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/xml/bind/Marshaller;Ljava/lang/Object;)V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/sax/SAXSource", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/util/JAXBSource$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/util/JAXBSource$1", "<init>", "(Ljakarta/xml/bind/util/JAXBSource;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/bind/util/JAXBSource", "pseudoParser", "Lorg/xml/sax/XMLReader;");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXBSource.NullMarshaller");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"jakarta/xml/bind/util/JAXBSource", "jakarta/xml/bind/Marshaller", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JAXBSource.NullContent");
methodVisitor.visitMethodInsn(INVOKESTATIC, "jakarta/xml/bind/util/Messages", "format", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/bind/util/JAXBSource", "marshaller", "Ljakarta/xml/bind/Marshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "jakarta/xml/bind/util/JAXBSource", "contentObject", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/bind/util/JAXBSource", "pseudoParser", "Lorg/xml/sax/XMLReader;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/sax/SAXSource", "setXMLReader", "(Lorg/xml/sax/XMLReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/InputSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/InputSource", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/sax/SAXSource", "setInputSource", "(Lorg/xml/sax/InputSource;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "assertionFailed", "(Ljava/lang/String;)Ljakarta/xml/bind/Marshaller;", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljakarta/xml/bind/util/JAXBSource;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/bind/util/JAXBSource", "contentObject", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Ljakarta/xml/bind/util/JAXBSource;)Ljakarta/xml/bind/Marshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "jakarta/xml/bind/util/JAXBSource", "marshaller", "Ljakarta/xml/bind/Marshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
