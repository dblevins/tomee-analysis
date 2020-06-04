package asm.org.apache.activemq.protobuf;
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
public class WireFormatDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/activemq/protobuf/WireFormat", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIRETYPE_VARINT", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIRETYPE_FIXED64", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIRETYPE_LENGTH_DELIMITED", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIRETYPE_START_GROUP", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIRETYPE_END_GROUP", "I", null, new Integer(4));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WIRETYPE_FIXED32", "I", null, new Integer(5));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_TYPE_BITS", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TAG_TYPE_MASK", "I", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_ITEM", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_TYPE_ID", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_MESSAGE", "I", null, new Integer(3));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_ITEM_TAG", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_ITEM_END_TAG", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_TYPE_ID_TAG", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MESSAGE_SET_MESSAGE_TAG", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getTagWireType", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getTagFieldNumber", "(I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IUSHR);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "makeTag", "(II)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ISHL);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IOR);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/WireFormat", "makeTag", "(II)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/protobuf/WireFormat", "MESSAGE_SET_ITEM_TAG", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/WireFormat", "makeTag", "(II)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/protobuf/WireFormat", "MESSAGE_SET_ITEM_END_TAG", "I");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/WireFormat", "makeTag", "(II)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/protobuf/WireFormat", "MESSAGE_SET_TYPE_ID_TAG", "I");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/protobuf/WireFormat", "makeTag", "(II)I", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/protobuf/WireFormat", "MESSAGE_SET_MESSAGE_TAG", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
