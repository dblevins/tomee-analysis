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
public class LazyAttachmentCollection$LazyAttachmentMap$1$1$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "Ljava/lang/Object;Ljava/util/Map$Entry<Ljava/lang/String;Ljakarta/activation/DataHandler;>;", "java/lang/Object", new String[] { "java/util/Map$Entry" });

classWriter.visitOuterClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1", "next", "()Ljava/util/Map$Entry;");

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap", "org/apache/cxf/attachment/LazyAttachmentCollection", "LazyAttachmentMap", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(0, "at", "Lorg/apache/cxf/message/Attachment;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$2", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "this$2", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "this$2", "Lorg/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1", "it", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/message/Attachment");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "at", "Lorg/apache/cxf/message/Attachment;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKey", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "at", "Lorg/apache/cxf/message/Attachment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Attachment", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValue", "()Ljakarta/activation/DataHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "at", "Lorg/apache/cxf/message/Attachment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Attachment", "getDataHandler", "()Ljakarta/activation/DataHandler;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValue", "(Ljakarta/activation/DataHandler;)Ljakarta/activation/DataHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "at", "Lorg/apache/cxf/message/Attachment;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/cxf/attachment/AttachmentImpl");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "at", "Lorg/apache/cxf/message/Attachment;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Attachment", "getDataHandler", "()Ljakarta/activation/DataHandler;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "at", "Lorg/apache/cxf/message/Attachment;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/attachment/AttachmentImpl");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/AttachmentImpl", "setDataHandler", "(Ljakarta/activation/DataHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/activation/DataHandler");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "setValue", "(Ljakarta/activation/DataHandler;)Ljakarta/activation/DataHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getValue", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "getValue", "()Ljakarta/activation/DataHandler;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getKey", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/attachment/LazyAttachmentCollection$LazyAttachmentMap$1$1$1", "getKey", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
