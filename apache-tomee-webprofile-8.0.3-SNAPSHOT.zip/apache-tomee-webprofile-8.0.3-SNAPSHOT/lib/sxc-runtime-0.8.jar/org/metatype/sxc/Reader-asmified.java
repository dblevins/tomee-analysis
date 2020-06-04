package asm.org.metatype.sxc;
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
public class ReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/metatype/sxc/Reader", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "context", "Lorg/metatype/sxc/Context;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlInputFactory", "Ljavax/xml/stream/XMLInputFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/metatype/sxc/Context;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/Reader", "context", "Lorg/metatype/sxc/Context;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/io/InputStream;Ljava/util/Map;)Ljava/lang/Object;", "(Ljava/io/InputStream;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
methodVisitor.visitTryCatchBlock(label2, label3, label2, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/Reader", "getXMLInputFactory", "()Ljavax/xml/stream/XMLInputFactory;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/XMLInputFactory", "createXMLStreamReader", "(Ljava/io/InputStream;)Ljavax/xml/stream/XMLStreamReader;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/Reader", "read", "(Ljavax/xml/stream/XMLStreamReader;Ljava/util/Map;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "close", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "close", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getXMLInputFactory", "()Ljavax/xml/stream/XMLInputFactory;", null, new String[] { "javax/xml/stream/FactoryConfigurationError" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/Reader", "xmlInputFactory", "Ljavax/xml/stream/XMLInputFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/XMLInputFactory", "newInstance", "()Ljavax/xml/stream/XMLInputFactory;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/Reader", "xmlInputFactory", "Ljavax/xml/stream/XMLInputFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/Reader", "xmlInputFactory", "Ljavax/xml/stream/XMLInputFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljava/io/InputStream;)Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/Reader", "read", "(Ljava/io/InputStream;Ljava/util/Map;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljavax/xml/stream/XMLStreamReader;)Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/Reader", "read", "(Ljavax/xml/stream/XMLStreamReader;Ljava/util/Map;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljavax/xml/stream/XMLStreamReader;Ljava/util/Map;)Ljava/lang/Object;", "(Ljavax/xml/stream/XMLStreamReader;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/XoXMLStreamReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/Reader", "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/util/Map;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Ljavax/xml/stream/XMLStreamReader;Ljava/util/Map;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", "(Ljavax/xml/stream/XMLStreamReader;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/util/XoXMLStreamReaderImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/Reader", "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/util/Map;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/util/Map;)Ljava/lang/Object;", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/util/Map;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", new String[] { "java/lang/Exception" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
