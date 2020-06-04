package asm.javax.xml.stream;
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
public class XMLOutputFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_1, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "javax/xml/stream/XMLOutputFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/xml/stream/FactoryFinder$ConfigurationError", "javax/xml/stream/FactoryFinder", "ConfigurationError", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_REPAIRING_NAMESPACES", "Ljava/lang/String;", null, "javax.xml.stream.isRepairingNamespaces");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PROPERTY_NAME", "Ljava/lang/String;", null, "javax.xml.stream.XMLOutputFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_FACTORY", "Ljava/lang/String;", null, "com.ctc.wstx.stax.WstxOutputFactory");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstance", "()Ljavax/xml/stream/XMLOutputFactory;", null, new String[] { "javax/xml/stream/FactoryConfigurationError" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "javax/xml/stream/FactoryFinder$ConfigurationError");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("javax.xml.stream.XMLOutputFactory");
methodVisitor.visitLdcInsn("com.ctc.wstx.stax.WstxOutputFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/FactoryFinder", "find", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLOutputFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/FactoryConfigurationError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/FactoryFinder$ConfigurationError", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/FactoryConfigurationError", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstance", "(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljavax/xml/stream/XMLInputFactory;", null, new String[] { "javax/xml/stream/FactoryConfigurationError" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "javax/xml/stream/FactoryFinder$ConfigurationError");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/SecuritySupport", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("com.ctc.wstx.stax.WstxInputFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/FactoryFinder", "find", "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLInputFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/FactoryConfigurationError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/stream/FactoryFinder$ConfigurationError", "getException", "()Ljava/lang/Exception;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/FactoryConfigurationError", "<init>", "(Ljava/lang/Exception;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamWriter", "(Ljava/io/Writer;)Ljavax/xml/stream/XMLStreamWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamWriter", "(Ljava/io/OutputStream;)Ljavax/xml/stream/XMLStreamWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamWriter", "(Ljava/io/OutputStream;Ljava/lang/String;)Ljavax/xml/stream/XMLStreamWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamWriter", "(Ljavax/xml/transform/Result;)Ljavax/xml/stream/XMLStreamWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventWriter", "(Ljavax/xml/transform/Result;)Ljavax/xml/stream/XMLEventWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventWriter", "(Ljava/io/OutputStream;)Ljavax/xml/stream/XMLEventWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventWriter", "(Ljava/io/OutputStream;Ljava/lang/String;)Ljavax/xml/stream/XMLEventWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventWriter", "(Ljava/io/Writer;)Ljavax/xml/stream/XMLEventWriter;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/IllegalArgumentException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPropertySupported", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
