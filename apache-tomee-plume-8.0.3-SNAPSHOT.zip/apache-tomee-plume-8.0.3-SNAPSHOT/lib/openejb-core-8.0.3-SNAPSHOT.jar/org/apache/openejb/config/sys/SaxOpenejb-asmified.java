package asm.org.apache.openejb.config.sys;
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
public class SaxOpenejbDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/sys/SaxOpenejb", null, "org/apache/openejb/config/sys/StackHandler", null);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$ImportElement", "org/apache/openejb/config/sys/SaxOpenejb", "ImportElement", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$JndiProviderElement", "org/apache/openejb/config/sys/SaxOpenejb", "JndiProviderElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$TransactionManagerElement", "org/apache/openejb/config/sys/SaxOpenejb", "TransactionManagerElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$ProxyFactoryElement", "org/apache/openejb/config/sys/SaxOpenejb", "ProxyFactoryElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$ConnectionManagerElement", "org/apache/openejb/config/sys/SaxOpenejb", "ConnectionManagerElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$SecurityServiceElement", "org/apache/openejb/config/sys/SaxOpenejb", "SecurityServiceElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$ContainerElement", "org/apache/openejb/config/sys/SaxOpenejb", "ContainerElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$DeploymentsElement", "org/apache/openejb/config/sys/SaxOpenejb", "DeploymentsElement", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$Document", "org/apache/openejb/config/sys/SaxOpenejb", "Document", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/config/sys/SaxOpenejb$Root", "org/apache/openejb/config/sys/SaxOpenejb", "Root", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "logger", "Lorg/apache/openejb/util/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HOME_VAR", "Ljava/lang/String;", null, "$home");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "openejb", "Lorg/apache/openejb/config/sys/Openejb;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/StackHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/Openejb");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/Openejb", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/config/sys/SaxOpenejb", "openejb", "Lorg/apache/openejb/config/sys/Openejb;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parse", "(Lorg/xml/sax/InputSource;)Lorg/apache/openejb/config/sys/Openejb;", null, new String[] { "org/xml/sax/SAXException", "javax/xml/parsers/ParserConfigurationException", "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Saxs", "factory", "()Ljavax/xml/parsers/SAXParserFactory;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/SAXParserFactory", "newSAXParser", "()Ljavax/xml/parsers/SAXParser;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxOpenejb");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxOpenejb", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/SAXParser", "parse", "(Lorg/xml/sax/InputSource;Lorg/xml/sax/helpers/DefaultHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxOpenejb", "openejb", "Lorg/apache/openejb/config/sys/Openejb;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startDocument", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/config/sys/SaxOpenejb$Document");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/sys/SaxOpenejb$Document", "<init>", "(Lorg/apache/openejb/config/sys/SaxOpenejb;Lorg/apache/openejb/config/sys/SaxOpenejb$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/sys/SaxOpenejb", "push", "(Lorg/xml/sax/helpers/DefaultHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getOpenejb", "()Lorg/apache/openejb/config/sys/Openejb;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxOpenejb", "openejb", "Lorg/apache/openejb/config/sys/Openejb;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/openejb/config/sys/SaxOpenejb;)Lorg/apache/openejb/config/sys/Openejb;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/config/sys/SaxOpenejb", "openejb", "Lorg/apache/openejb/config/sys/Openejb;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/util/LogCategory", "OPENEJB", "Lorg/apache/openejb/util/LogCategory;");
methodVisitor.visitLdcInsn("org.apache.openejb.config");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Logger", "getInstance", "(Lorg/apache/openejb/util/LogCategory;Ljava/lang/String;)Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/config/sys/SaxOpenejb", "logger", "Lorg/apache/openejb/util/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
