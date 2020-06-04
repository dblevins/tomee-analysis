package asm.org.apache.ws.commons.schema;
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
public class XmlSchemaCollection$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Lorg/w3c/dom/Document;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitOuterClass("org/apache/ws/commons/schema/XmlSchemaCollection", "parseDoPriv", "(Lorg/xml/sax/InputSource;Ljavax/xml/parsers/DocumentBuilder;Lorg/w3c/dom/Document;)Lorg/w3c/dom/Document;");

classWriter.visitInnerClass("org/apache/ws/commons/schema/XmlSchemaCollection$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$builder", "Ljavax/xml/parsers/DocumentBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$inputSource", "Lorg/xml/sax/InputSource;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaCollection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchemaCollection;Ljavax/xml/parsers/DocumentBuilder;Lorg/xml/sax/InputSource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "this$0", "Lorg/apache/ws/commons/schema/XmlSchemaCollection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "val$builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "val$inputSource", "Lorg/xml/sax/InputSource;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Lorg/w3c/dom/Document;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "val$builder", "Ljavax/xml/parsers/DocumentBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "val$inputSource", "Lorg/xml/sax/InputSource;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/DocumentBuilder", "parse", "(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/XmlSchemaCollection$2", "run", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
