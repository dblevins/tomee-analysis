package asm.org.apache.openejb.config;
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
public class FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicate", "Lorg/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate<Lorg/apache/xbean/finder/Annotated<Ljava/lang/reflect/Field;>;>;", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate", null);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "org/apache/openejb/config/FinderFactory", "ModuleLimitedFinder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "AnnotatedFieldPredicate", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate", "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder", "Predicate", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/List;)V", "(Ljava/util/List<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$Predicate", "<init>", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "name", "(Lorg/apache/xbean/finder/Annotated;)Ljava/lang/String;", "(Lorg/apache/xbean/finder/Annotated<Ljava/lang/reflect/Field;>;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/finder/Annotated", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/reflect/Field");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "getDeclaringClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "name", "(Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/finder/Annotated");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/config/FinderFactory$ModuleLimitedFinder$AnnotatedFieldPredicate", "name", "(Lorg/apache/xbean/finder/Annotated;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
