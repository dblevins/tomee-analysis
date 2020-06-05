package asm.org.apache.commons.jcs.jcache;
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
public class NoFilterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/jcs/jcache/NoFilter", "Ljava/lang/Object;Ljavax/cache/event/CacheEntryEventFilter<Ljava/lang/Object;Ljava/lang/Object;>;", "java/lang/Object", new String[] { "javax/cache/event/CacheEntryEventFilter" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Ljavax/cache/event/CacheEntryEventFilter;", "Ljavax/cache/event/CacheEntryEventFilter<Ljava/lang/Object;Ljava/lang/Object;>;", null);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljavax/cache/event/CacheEntryEvent;)Z", "(Ljavax/cache/event/CacheEntryEvent<**>;)Z", new String[] { "javax/cache/event/CacheEntryListenerException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/jcache/NoFilter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/jcache/NoFilter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/jcache/NoFilter", "INSTANCE", "Ljavax/cache/event/CacheEntryEventFilter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
