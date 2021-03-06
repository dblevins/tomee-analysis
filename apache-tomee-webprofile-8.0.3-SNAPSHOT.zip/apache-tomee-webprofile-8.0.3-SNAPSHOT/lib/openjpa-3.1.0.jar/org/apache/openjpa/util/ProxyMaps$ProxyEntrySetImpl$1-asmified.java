package asm.org.apache.openjpa.util;
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
public class ProxyMaps$ProxyEntrySetImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", null, "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitOuterClass("org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "iterator", "()Ljava/util/Iterator;");

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "org/apache/openjpa/util/ProxyMaps", "ProxyEntrySetImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/util/ProxyMaps$ProxyEntrySet", "org/apache/openjpa/util/ProxyMaps", "ProxyEntrySet", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_last", "Ljava/util/Map$Entry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$itr", "Ljava/util/Iterator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;Ljava/util/Iterator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "val$itr", "Ljava/util/Iterator;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "val$itr", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "val$itr", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "access$000", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;)I", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitLookupSwitchInsn(label2, new int[] { 0, 1 }, new Label[] { label0, label1 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "access$100", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;)Lorg/apache/openjpa/util/ProxyMap;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/Proxies", "dirty", "(Lorg/apache/openjpa/util/Proxy;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "val$itr", "Ljava/util/Iterator;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "remove", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "access$100", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;)Lorg/apache/openjpa/util/ProxyMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/util/ProxyMap", "getChangeTracker", "()Lorg/apache/openjpa/util/ChangeTracker;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "access$100", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;)Lorg/apache/openjpa/util/ProxyMap;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/util/ProxyMap", "getChangeTracker", "()Lorg/apache/openjpa/util/ChangeTracker;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/util/MapChangeTracker");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/util/MapChangeTracker", "removed", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "access$100", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;)Lorg/apache/openjpa/util/ProxyMap;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/Proxies", "removed", "(Lorg/apache/openjpa/util/Proxy;Ljava/lang/Object;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "this$0", "Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl", "access$100", "(Lorg/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl;)Lorg/apache/openjpa/util/ProxyMap;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/util/ProxyMaps$ProxyEntrySetImpl$1", "_last", "Ljava/util/Map$Entry;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/Proxies", "removed", "(Lorg/apache/openjpa/util/Proxy;Ljava/lang/Object;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
