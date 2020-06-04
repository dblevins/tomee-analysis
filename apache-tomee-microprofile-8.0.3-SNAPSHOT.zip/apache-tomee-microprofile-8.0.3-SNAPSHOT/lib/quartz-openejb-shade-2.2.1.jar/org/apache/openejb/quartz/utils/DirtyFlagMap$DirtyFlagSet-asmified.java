package asm.org.apache.openejb.quartz.utils;
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
public class DirtyFlagMap$DirtyFlagSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagSet", "<T:Ljava/lang/Object;>Lorg/apache/openejb/quartz/utils/DirtyFlagMap<TK;TV;>.DirtyFlagCollection<TT;>;Ljava/util/Set<TT;>;", "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagCollection", new String[] { "java/util/Set" });

classWriter.visitInnerClass("org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagSet", "org/apache/openejb/quartz/utils/DirtyFlagMap", "DirtyFlagSet", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagCollection", "org/apache/openejb/quartz/utils/DirtyFlagMap", "DirtyFlagCollection", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/quartz/utils/DirtyFlagMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/quartz/utils/DirtyFlagMap;Ljava/util/Set;)V", "(Ljava/util/Set<TT;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagSet", "this$0", "Lorg/apache/openejb/quartz/utils/DirtyFlagMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagCollection", "<init>", "(Lorg/apache/openejb/quartz/utils/DirtyFlagMap;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getWrappedSet", "()Ljava/util/Set;", "()Ljava/util/Set<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/DirtyFlagMap$DirtyFlagSet", "getWrappedCollection", "()Ljava/util/Collection;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
