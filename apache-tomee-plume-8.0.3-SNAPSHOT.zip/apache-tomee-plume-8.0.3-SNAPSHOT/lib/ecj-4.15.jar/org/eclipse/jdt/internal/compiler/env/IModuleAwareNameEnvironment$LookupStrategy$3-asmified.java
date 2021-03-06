package asm.org.eclipse.jdt.internal.compiler.env;
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
public class IModuleAwareNameEnvironment$LookupStrategy$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ENUM, "org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy$3", null, "org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy", null);

classWriter.visitOuterClass("org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy", null, null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy", "org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment", "LookupStrategy", ACC_PUBLIC | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy$3", null, null, ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy", "<init>", "(Ljava/lang/String;ILorg/eclipse/jdt/internal/compiler/env/IModuleAwareNameEnvironment$LookupStrategy;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "matchesWithName", "(Ljava/lang/Object;Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Z", "<T:Ljava/lang/Object;>(TT;Ljava/util/function/Predicate<TT;>;Ljava/util/function/Predicate<TT;>;)Z", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
