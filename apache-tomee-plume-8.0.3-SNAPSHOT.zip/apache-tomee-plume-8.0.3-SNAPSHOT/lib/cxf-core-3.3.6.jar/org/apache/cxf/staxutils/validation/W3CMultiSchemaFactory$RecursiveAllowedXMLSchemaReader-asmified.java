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
public class W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", null, "com/sun/msv/reader/xmlschema/XMLSchemaReader", null);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory", "RecursiveAllowedXMLSchemaReader", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1", null, null, 0);

classWriter.visitInnerClass("com/sun/msv/reader/xmlschema/XMLSchemaReader$StateFactory", "com/sun/msv/reader/xmlschema/XMLSchemaReader", "StateFactory", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "sysIds", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/msv/reader/GrammarReaderController;Ljavax/xml/parsers/SAXParserFactory;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader$1", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "com/sun/msv/grammar/ExpressionPool");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/grammar/ExpressionPool", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/XMLSchemaReader", "<init>", "(Lcom/sun/msv/reader/GrammarReaderController;Ljavax/xml/parsers/SAXParserFactory;Lcom/sun/msv/reader/xmlschema/XMLSchemaReader$StateFactory;Lcom/sun/msv/grammar/ExpressionPool;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/TreeSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TreeSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "sysIds", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLocator", "(Lorg/xml/sax/Locator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "getLocator", "()Lorg/xml/sax/Locator;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "getLocator", "()Lorg/xml/sax/Locator;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Locator", "getSystemId", "()Ljava/lang/String;", true);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "sysIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "getLocator", "()Lorg/xml/sax/Locator;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Locator", "getSystemId", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/XMLSchemaReader", "setLocator", "(Lorg/xml/sax/Locator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "switchSource", "(Ljavax/xml/transform/Source;Lcom/sun/msv/reader/State;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/transform/Source", "getSystemId", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "sysIds", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/msv/reader/xmlschema/XMLSchemaReader", "switchSource", "(Ljavax/xml/transform/Source;Lcom/sun/msv/reader/State;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$002", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "currentSchema", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "currentSchema", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$202", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "currentSchema", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "currentSchema", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "(Lorg/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader;)Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/validation/W3CMultiSchemaFactory$RecursiveAllowedXMLSchemaReader", "currentSchema", "Lcom/sun/msv/grammar/xmlschema/XMLSchemaSchema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
