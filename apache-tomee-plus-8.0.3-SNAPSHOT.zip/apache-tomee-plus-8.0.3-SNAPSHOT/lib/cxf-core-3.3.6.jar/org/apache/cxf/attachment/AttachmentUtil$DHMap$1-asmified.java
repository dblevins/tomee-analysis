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
public class AttachmentUtil$DHMap$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/attachment/AttachmentUtil$DHMap$1", "Ljava/util/AbstractSet<Ljava/util/Map$Entry<Ljava/lang/String;Ljavax/activation/DataHandler;>;>;", "java/util/AbstractSet", null);

classWriter.visitOuterClass("org/apache/cxf/attachment/AttachmentUtil$DHMap", "entrySet", "()Ljava/util/Set;");

classWriter.visitInnerClass("org/apache/cxf/attachment/AttachmentUtil$DHMap", "org/apache/cxf/attachment/AttachmentUtil", "DHMap", ACC_STATIC);

classWriter.visitInnerClass("org/apache/cxf/attachment/AttachmentUtil$DHMap$1", null, null, 0);

classWriter.visitInnerClass("org/apache/cxf/attachment/AttachmentUtil$DHMap$1$1", null, null, 0);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/attachment/AttachmentUtil$DHMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/attachment/AttachmentUtil$DHMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/attachment/AttachmentUtil$DHMap$1", "this$0", "Lorg/apache/cxf/attachment/AttachmentUtil$DHMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractSet", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", "()Ljava/util/Iterator<Ljava/util/Map$Entry<Ljava/lang/String;Ljavax/activation/DataHandler;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/AttachmentUtil$DHMap$1", "this$0", "Lorg/apache/cxf/attachment/AttachmentUtil$DHMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/AttachmentUtil$DHMap", "list", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/attachment/AttachmentUtil$DHMap$1$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/attachment/AttachmentUtil$DHMap$1$1", "<init>", "(Lorg/apache/cxf/attachment/AttachmentUtil$DHMap$1;Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/AttachmentUtil$DHMap$1", "this$0", "Lorg/apache/cxf/attachment/AttachmentUtil$DHMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/attachment/AttachmentUtil$DHMap", "list", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "size", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
