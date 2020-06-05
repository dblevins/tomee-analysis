package asm.org.apache.cxf.wsdl11;
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
public class AbstractWrapperWSDLLocatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", null, "java/lang/Object", new String[] { "javax/wsdl/xml/WSDLLocator" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ALLOWED_SCHEMES", "Ljava/util/List;", "Ljava/util/List<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "parent", "Ljavax/wsdl/xml/WSDLLocator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "wsdlUrl", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "last", "Lorg/xml/sax/InputSource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "baseUri", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "lastImport", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "fromParent", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljavax/wsdl/xml/WSDLLocator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "wsdlUrl", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "parent", "Ljavax/wsdl/xml/WSDLLocator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "close", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "fromParent", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "last", "Lorg/xml/sax/InputSource;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getByteStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "last", "Lorg/xml/sax/InputSource;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getByteStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "parent", "Ljavax/wsdl/xml/WSDLLocator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/xml/WSDLLocator", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInputSource", "()Lorg/xml/sax/InputSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInputSource", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseInputSource", "()Lorg/xml/sax/InputSource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "parent", "Ljavax/wsdl/xml/WSDLLocator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/xml/WSDLLocator", "getBaseInputSource", "()Lorg/xml/sax/InputSource;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "fromParent", "Z");
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "getInputSource", "()Lorg/xml/sax/InputSource;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "fromParent", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/xml/sax/InputSource"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getSystemId", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "baseUri", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "last", "Lorg/xml/sax/InputSource;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBaseURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "last", "Lorg/xml/sax/InputSource;");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "getBaseInputSource", "()Lorg/xml/sax/InputSource;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "last", "Lorg/xml/sax/InputSource;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getByteStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "last", "Lorg/xml/sax/InputSource;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getByteStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "baseUri", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getImportInputSource", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/net/URISyntaxException");
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "java/net/URI");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URI", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getScheme", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "ALLOWED_SCHEMES", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getScheme", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("The ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "getScheme", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" URI scheme is not allowed");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/net/URISyntaxException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "parent", "Ljavax/wsdl/xml/WSDLLocator;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/xml/WSDLLocator", "getImportInputSource", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "lastImport", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getByteStream", "()Ljava/io/InputStream;", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getCharacterStream", "()Ljava/io/Reader;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/xml/sax/InputSource"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "getInputSource", "(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "getSystemId", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "lastImport", "Ljava/lang/String;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLatestImportURI", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "lastImport", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "lastImport", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "parent", "Ljavax/wsdl/xml/WSDLLocator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/xml/WSDLLocator", "getLatestImportURI", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("file");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("http");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("https");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("classpath");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("jar");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableList", "(Ljava/util/List;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/wsdl11/AbstractWrapperWSDLLocator", "ALLOWED_SCHEMES", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
