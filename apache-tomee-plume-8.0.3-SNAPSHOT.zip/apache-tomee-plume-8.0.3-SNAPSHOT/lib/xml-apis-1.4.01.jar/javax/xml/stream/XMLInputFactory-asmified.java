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
public class XMLInputFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_1, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "javax/xml/stream/XMLInputFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("javax/xml/stream/FactoryFinder$ConfigurationError", "javax/xml/stream/FactoryFinder", "ConfigurationError", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALLOCATOR", "Ljava/lang/String;", null, "javax.xml.stream.allocator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_COALESCING", "Ljava/lang/String;", null, "javax.xml.stream.isCoalescing");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_NAMESPACE_AWARE", "Ljava/lang/String;", null, "javax.xml.stream.isNamespaceAware");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_REPLACING_ENTITY_REFERENCES", "Ljava/lang/String;", null, "javax.xml.stream.isReplacingEntityReferences");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_SUPPORTING_EXTERNAL_ENTITIES", "Ljava/lang/String;", null, "javax.xml.stream.isSupportingExternalEntities");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_VALIDATING", "Ljava/lang/String;", null, "javax.xml.stream.isValidating");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REPORTER", "Ljava/lang/String;", null, "javax.xml.stream.reporter");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOLVER", "Ljava/lang/String;", null, "javax.xml.stream.resolver");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUPPORT_DTD", "Ljava/lang/String;", null, "javax.xml.stream.supportDTD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PROPERTY_NAME", "Ljava/lang/String;", null, "javax.xml.stream.XMLInputFactory");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "DEFAULT_FACTORY", "Ljava/lang/String;", null, "com.ctc.wstx.stax.WstxInputFactory");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "newInstance", "()Ljavax/xml/stream/XMLInputFactory;", null, new String[] { "javax/xml/stream/FactoryConfigurationError" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "javax/xml/stream/FactoryFinder$ConfigurationError");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("javax.xml.stream.XMLInputFactory");
methodVisitor.visitLdcInsn("com.ctc.wstx.stax.WstxInputFactory");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/xml/stream/FactoryFinder", "find", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/stream/XMLInputFactory");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamReader", "(Ljava/io/Reader;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamReader", "(Ljavax/xml/transform/Source;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamReader", "(Ljava/io/InputStream;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamReader", "(Ljava/io/InputStream;Ljava/lang/String;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamReader", "(Ljava/lang/String;Ljava/io/InputStream;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLStreamReader", "(Ljava/lang/String;Ljava/io/Reader;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljava/io/Reader;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljava/lang/String;Ljava/io/Reader;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljavax/xml/stream/XMLStreamReader;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljavax/xml/transform/Source;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljava/io/InputStream;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljava/io/InputStream;Ljava/lang/String;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createXMLEventReader", "(Ljava/lang/String;Ljava/io/InputStream;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createFilteredReader", "(Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/stream/StreamFilter;)Ljavax/xml/stream/XMLStreamReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createFilteredReader", "(Ljavax/xml/stream/XMLEventReader;Ljavax/xml/stream/EventFilter;)Ljavax/xml/stream/XMLEventReader;", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXMLResolver", "()Ljavax/xml/stream/XMLResolver;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setXMLResolver", "(Ljavax/xml/stream/XMLResolver;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXMLReporter", "()Ljavax/xml/stream/XMLReporter;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setXMLReporter", "(Ljavax/xml/stream/XMLReporter;)V", null, null);
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
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEventAllocator", "(Ljavax/xml/stream/util/XMLEventAllocator;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEventAllocator", "()Ljavax/xml/stream/util/XMLEventAllocator;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
