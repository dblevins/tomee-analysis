package asm.com.sun.faces.flow.builder;
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
public class NavigationCaseBuilderImpl$RedirectBuilderImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", null, "javax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder", null);

classWriter.visitInnerClass("com/sun/faces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", "com/sun/faces/flow/builder/NavigationCaseBuilderImpl", "RedirectBuilderImpl", ACC_PRIVATE);

classWriter.visitInnerClass("javax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder", "javax/faces/flow/builder/NavigationCaseBuilder", "RedirectBuilder", ACC_PUBLIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", "this$0", "Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder", "<init>", "(Ljavax/faces/flow/builder/NavigationCaseBuilder;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameter", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("name");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/Util", "notNull", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", "this$0", "Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/flow/builder/NavigationCaseBuilderImpl", "access$000", "(Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;)Lcom/sun/faces/flow/builder/MutableNavigationCase;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/flow/builder/MutableNavigationCase", "getParameters", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/List");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/CopyOnWriteArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/CopyOnWriteArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/util/Map", "java/util/List"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "includeViewParams", "()Ljavax/faces/flow/builder/NavigationCaseBuilder$RedirectBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/flow/builder/NavigationCaseBuilderImpl$RedirectBuilderImpl", "this$0", "Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/flow/builder/NavigationCaseBuilderImpl", "access$000", "(Lcom/sun/faces/flow/builder/NavigationCaseBuilderImpl;)Lcom/sun/faces/flow/builder/MutableNavigationCase;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/flow/builder/MutableNavigationCase", "isIncludeViewParams", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
