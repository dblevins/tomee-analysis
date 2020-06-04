package asm.org.metatype.sxc.util;
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
public class XoXMLStreamReaderImpl$AttributeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", null, "java/lang/Object", new String[] { "org/metatype/sxc/util/Attribute" });

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "org/metatype/sxc/util/XoXMLStreamReaderImpl", "AttributesIterator", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "org/metatype/sxc/util/XoXMLStreamReaderImpl", "AttributeImpl", ACC_PUBLIC | ACC_FINAL);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributeName", "(I)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributeLocalName", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespace", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributeNamespace", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPrefix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributePrefix", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributeType", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl", "getAttributeValue", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBooleanValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "parseBoolean", "(Ljava/lang/String;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getByteValue", "()B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "parseByte", "(Ljava/lang/String;)B", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getShortValue", "()S", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "parseShort", "(Ljava/lang/String;)S", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIntValue", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "parseInt", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLongValue", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "parseLong", "(Ljava/lang/String;)J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFloatValue", "()F", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "parseFloat", "(Ljava/lang/String;)F", false);
methodVisitor.visitInsn(FRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDoubleValue", "()D", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "parseDouble", "(Ljava/lang/String;)D", false);
methodVisitor.visitInsn(DRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlListValue", "()Ljava/lang/Iterable;", "()Ljava/lang/Iterable<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\\s+");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "split", "(Ljava/lang/String;)[Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "attributesIterator", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator", "access$400", "(Lorg/metatype/sxc/util/XoXMLStreamReaderImpl$AttributesIterator;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReader", "()Lorg/metatype/sxc/util/XoXMLStreamReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/metatype/sxc/util/XoXMLStreamReaderImpl$AttributeImpl", "this$0", "Lorg/metatype/sxc/util/XoXMLStreamReaderImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
