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
public class W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", null, "com/sun/msv/reader/xmlschema/SchemaState", null);

classWriter.visitOuterClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1", "schemaHead", "(Ljava/lang/String;)Lcom/sun/msv/reader/State;");

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "RecursiveAllowedXMLSchemaReader", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "old", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", "this$1", "Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/SchemaState", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "endSelf", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/SchemaState", "endSelf", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", "reader", "Lcom/sun/msv/reader/GrammarReader;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", "old", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "access$002", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "onTargetNamespaceResolved", "(Ljava/lang/String;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", "reader", "Lcom/sun/msv/reader/GrammarReader;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "access$100", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1$1", "old", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "getOrCreateSchema", "(Ljava/lang/String;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "access$202", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "access$300", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "isSchemaDefined", "(Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "access$400", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "markSchemaAsDefined", "(Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
