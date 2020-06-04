package asm.org.apache.cxf.staxutils.validation;
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
public class W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1", null, "com/sun/msv/reader/xmlschema/XMLSchemaReader$StateFactory", null);

classWriter.visitOuterClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "<init>", "(Lcom/sun/msv/reader/GrammarReaderController;Ljavax/xml/parsers/SAXParserFactory;)V");

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "RecursiveAllowedXMLSchemaReader", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", null, null, 0);

classWriter.visitInnerClass("com/sun/msv/reader/xmlschema/XMLSchemaReader$StateFactory", "com/sun/msv/reader/xmlschema/XMLSchemaReader", "StateFactory", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/XMLSchemaReader$StateFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "schemaHead", "(Ljava/lang/String;)Lcom/sun/msv/reader/State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", "<init>", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
