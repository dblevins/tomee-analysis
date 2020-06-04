package asm.org.apache.cxf.attachment;
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
public class LazyAttachmentCollection$LazyAttachmentMap$2$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "Ljava/lang/Object;Ljava/util/Iterator<Ljava/lang/String;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap", "org/apache/cxf/attachment/LazyAttachmentCollection", "LazyAttachmentMap", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(0, "it", "Ljava/util/Iterator;", "Ljava/util/Iterator<Lorg/apache/cxf/message/Attachment;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "this$1", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "this$1", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2", "this$0", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap", "collection", "Lorg/apache/cxf/attachment/LazyAttachmentCollection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/LazyAttachmentCollection", "iterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "it", "Ljava/util/Iterator;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "it", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "it", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/message/Attachment");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Attachment", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "it", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$2$1", "next", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
