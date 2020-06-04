package asm.org.eclipse.jdt.internal.compiler.apt.model;
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
public class ModuleElementImpl$ExportsDirectiveImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", null, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$PackageDirectiveImpl", new String[] { "javax/lang/model/element/ModuleElement$ExportsDirective" });

classWriter.visitInnerClass("javax/lang/model/element/ModuleElement$DirectiveKind", "javax/lang/model/element/ModuleElement", "DirectiveKind", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/lang/model/element/ModuleElement$DirectiveVisitor", "javax/lang/model/element/ModuleElement", "DirectiveVisitor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("javax/lang/model/element/ModuleElement$ExportsDirective", "javax/lang/model/element/ModuleElement", "ExportsDirective", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl", "ExportsDirectiveImpl", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$PackageDirectiveImpl", "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl", "PackageDirectiveImpl", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl;Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$PackageDirectiveImpl", "<init>", "(Lorg/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl;Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "accept", "(Ljavax/lang/model/element/ModuleElement$DirectiveVisitor;Ljava/lang/Object;)Ljava/lang/Object;", "<R:Ljava/lang/Object;P:Ljava/lang/Object;>(Ljavax/lang/model/element/ModuleElement$DirectiveVisitor<TR;TP;>;TP;)TR;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/lang/model/element/ModuleElement$DirectiveVisitor", "visitExports", "(Ljavax/lang/model/element/ModuleElement$ExportsDirective;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getKind", "()Ljavax/lang/model/element/ModuleElement$DirectiveKind;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/lang/model/element/ModuleElement$DirectiveKind", "EXPORTS", "Ljavax/lang/model/element/ModuleElement$DirectiveKind;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPackage", "()Ljavax/lang/model/element/PackageElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl", "_env", "Lorg/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/dispatch/BaseProcessingEnvImpl", "getFactory", "()Lorg/eclipse/jdt/internal/compiler/apt/model/Factory;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "binding", "Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/model/Factory", "newPackageElement", "(Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;)Ljavax/lang/model/element/PackageElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTargetModules", "()Ljava/util/List;", "()Ljava/util/List<+Ljavax/lang/model/element/ModuleElement;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "targets", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "targets", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "this$0", "Lorg/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl;");
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl", "binding", "Lorg/eclipse/jdt/internal/compiler/lookup/ModuleBinding;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "binding", "Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/lookup/ModuleBinding", "getExportRestrictions", "(Lorg/eclipse/jdt/internal/compiler/lookup/PackageBinding;)[Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/jdt/internal/compiler/apt/model/ModuleElementImpl$ExportsDirectiveImpl", "getTargetModules", "([Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
