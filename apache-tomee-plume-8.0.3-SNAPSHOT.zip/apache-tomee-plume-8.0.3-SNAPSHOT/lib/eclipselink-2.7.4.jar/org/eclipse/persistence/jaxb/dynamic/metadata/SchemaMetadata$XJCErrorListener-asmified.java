package asm.org.eclipse.persistence.jaxb.dynamic.metadata;
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
public class SchemaMetadata$XJCErrorListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata$XJCErrorListener", null, "java/lang/Object", new String[] { "com/sun/tools/xjc/api/ErrorListener" });

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata$XJCErrorListener", "org/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata", "XJCErrorListener", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata$XJCErrorListener", "this$0", "Lorg/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "error", "(Lorg/xml/sax/SAXParseException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fatalError", "(Lorg/xml/sax/SAXParseException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Lorg/xml/sax/SAXParseException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warning", "(Lorg/xml/sax/SAXParseException;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/JAXBException", "errorCreatingDynamicJAXBContext", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/JAXBException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata;Lorg/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata$XJCErrorListener", "<init>", "(Lorg/eclipse/persistence/jaxb/dynamic/metadata/SchemaMetadata;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
