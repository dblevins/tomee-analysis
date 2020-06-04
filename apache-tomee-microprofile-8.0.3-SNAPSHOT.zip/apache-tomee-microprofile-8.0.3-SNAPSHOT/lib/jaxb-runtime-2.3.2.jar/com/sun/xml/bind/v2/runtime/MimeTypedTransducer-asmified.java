package asm.com.sun.xml.bind.v2.runtime;
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
public class MimeTypedTransducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "<V:Ljava/lang/Object;>Lcom/sun/xml/bind/v2/runtime/FilterTransducer<TV;>;", "com/sun/xml/bind/v2/runtime/FilterTransducer", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "expectedMimeType", "Ljavax/activation/MimeType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;Ljavax/activation/MimeType;)V", "(Lcom/sun/xml/bind/v2/runtime/Transducer<TV;>;Ljavax/activation/MimeType;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/runtime/FilterTransducer", "<init>", "(Lcom/sun/xml/bind/v2/runtime/Transducer;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "expectedMimeType", "Ljavax/activation/MimeType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", "(TV;)Ljava/lang/CharSequence;", new String[] { "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/runtime/XMLSerializer", "getInstance", "()Lcom/sun/xml/bind/v2/runtime/XMLSerializer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "expectedMimeType", "Ljavax/activation/MimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "core", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "print", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "java/lang/Object", "com/sun/xml/bind/v2/runtime/XMLSerializer", "javax/activation/MimeType"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeText", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;Ljava/lang/String;)V", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;TV;Ljava/lang/String;)V", new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException", "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "expectedMimeType", "Ljavax/activation/MimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "core", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "writeText", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Ljava/lang/Object;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "com/sun/xml/bind/v2/runtime/XMLSerializer", "java/lang/Object", "java/lang/String", "javax/activation/MimeType"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeLeafElement", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;Ljava/lang/String;)V", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;TV;Ljava/lang/String;)V", new String[] { "java/io/IOException", "org/xml/sax/SAXException", "javax/xml/stream/XMLStreamException", "com/sun/xml/bind/api/AccessorException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "expectedMimeType", "Ljavax/activation/MimeType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "core", "Lcom/sun/xml/bind/v2/runtime/Transducer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/runtime/Transducer", "writeLeafElement", "(Lcom/sun/xml/bind/v2/runtime/XMLSerializer;Lcom/sun/xml/bind/v2/runtime/Name;Ljava/lang/Object;Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitInsn(POP);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"com/sun/xml/bind/v2/runtime/MimeTypedTransducer", "com/sun/xml/bind/v2/runtime/XMLSerializer", "com/sun/xml/bind/v2/runtime/Name", "java/lang/Object", "java/lang/String", "javax/activation/MimeType"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/runtime/XMLSerializer", "setExpectedMimeType", "(Ljavax/activation/MimeType;)Ljavax/activation/MimeType;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
