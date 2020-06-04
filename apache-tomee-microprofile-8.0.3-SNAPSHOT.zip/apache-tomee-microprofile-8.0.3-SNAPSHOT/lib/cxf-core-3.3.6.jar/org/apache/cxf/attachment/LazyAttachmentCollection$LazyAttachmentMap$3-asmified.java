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
public class LazyAttachmentCollection$LazyAttachmentMap$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3", "Ljava/util/AbstractCollection<Ljavax/activation/DataHandler;>;", "java/util/AbstractCollection", null);

classWriter.visitOuterClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap", "values", "()Ljava/util/Collection;");

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap", "org/apache/cxf/attachment/LazyAttachmentCollection", "LazyAttachmentMap", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3", "this$0", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractCollection", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljavax/activation/DataHandler;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3$1", "<init>", "(Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$3", "this$0", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap", "collection", "Lorg/apache/cxf/attachment/LazyAttachmentCollection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/LazyAttachmentCollection", "size", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
