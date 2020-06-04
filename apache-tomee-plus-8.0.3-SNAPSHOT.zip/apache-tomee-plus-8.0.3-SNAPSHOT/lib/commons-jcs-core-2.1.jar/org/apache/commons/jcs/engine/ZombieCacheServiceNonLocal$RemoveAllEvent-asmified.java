package asm.org.apache.commons.jcs.engine;
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
public class ZombieCacheServiceNonLocal$RemoveAllEventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$RemoveAllEvent", null, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$ZombieEvent", null);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$RemoveAllEvent", "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal", "RemoveAllEvent", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$ZombieEvent", "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal", "ZombieEvent", ACC_PROTECTED | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;J)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$ZombieEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$RemoveAllEvent", "cacheName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/engine/ZombieCacheServiceNonLocal$RemoveAllEvent", "requesterId", "J");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
