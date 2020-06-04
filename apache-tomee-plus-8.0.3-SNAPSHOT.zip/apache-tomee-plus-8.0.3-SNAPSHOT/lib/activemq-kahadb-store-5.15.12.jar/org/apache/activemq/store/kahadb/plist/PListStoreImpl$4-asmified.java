package asm.org.apache.activemq.store.kahadb.plist;
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
public class PListStoreImpl$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "Ljava/lang/Object;Lorg/apache/activemq/store/kahadb/disk/page/Transaction$Closure<Ljava/io/IOException;>;", "java/lang/Object", new String[] { "org/apache/activemq/store/kahadb/disk/page/Transaction$Closure" });

classWriter.visitOuterClass("org/apache/activemq/store/kahadb/plist/PListStoreImpl", "intialize", "()V");

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", null, null, 0);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "MetaData", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/disk/page/Transaction$Closure", "org/apache/activemq/store/kahadb/disk/page/Transaction", "Closure", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller", "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "MetaDataMarshaller", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "pageFile", "Lorg/apache/activemq/store/kahadb/disk/page/PageFile;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/PageFile", "getPageCount", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "allocate", "()Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "$assertionsDisabled", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "getPageId", "()J", false);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/store/kahadb/disk/page/Page"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "createIndexes", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaDataMarshaller", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "store", "(Lorg/apache/activemq/store/kahadb/disk/page/Page;Lorg/apache/activemq/store/kahadb/disk/util/Marshaller;Z)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(LCONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaDataMarshaller", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaDataMarshaller;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Transaction", "load", "(JLorg/apache/activemq/store/kahadb/disk/util/Marshaller;)Lorg/apache/activemq/store/kahadb/disk/page/Page;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/disk/page/Page", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "page", "Lorg/apache/activemq/store/kahadb/disk/page/Page;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "load", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "metaData", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "this$0", "Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/store/kahadb/plist/PListStoreImpl", "persistentLists", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$MetaData", "loadLists", "(Lorg/apache/activemq/store/kahadb/disk/page/Transaction;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/store/kahadb/plist/PListStoreImpl;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/store/kahadb/plist/PListStoreImpl$4", "$assertionsDisabled", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
