package asm.org.eclipse.persistence.internal.helper;
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
public class IdentityWeakHashMap$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", null, "java/util/AbstractCollection", null);

classWriter.visitOuterClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "values", "()Ljava/util/Collection;");

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", null, null, 0);

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/IdentityWeakHashMap$COMPONENT_TYPES", "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "COMPONENT_TYPES", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", "this$0", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/AbstractCollection", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "iterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", "this$0", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$COMPONENT_TYPES", "VALUES", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$COMPONENT_TYPES;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "access$2", "(Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap$COMPONENT_TYPES;)Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "size", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", "this$0", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "count", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "contains", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", "this$0", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "containsValue", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap$2", "this$0", "Lorg/eclipse/persistence/internal/helper/IdentityWeakHashMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/IdentityWeakHashMap", "clear", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
