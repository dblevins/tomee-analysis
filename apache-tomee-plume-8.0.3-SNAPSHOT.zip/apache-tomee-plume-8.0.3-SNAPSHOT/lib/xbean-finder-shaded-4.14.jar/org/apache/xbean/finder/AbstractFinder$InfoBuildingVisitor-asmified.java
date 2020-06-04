package asm.org.apache.xbean.finder;
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
public class AbstractFinder$InfoBuildingVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", null, "org/apache/xbean/asm7/shade/commons/EmptyVisitor", null);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$Info", "org/apache/xbean/finder/AbstractFinder", "Info", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "org/apache/xbean/finder/AbstractFinder", "InfoBuildingVisitor", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$ClassInfo", "org/apache/xbean/finder/AbstractFinder", "ClassInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$AnnotationInfo", "org/apache/xbean/finder/AbstractFinder", "AnnotationInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$FieldInfo", "org/apache/xbean/finder/AbstractFinder", "FieldInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$MethodInfo", "org/apache/xbean/finder/AbstractFinder", "MethodInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$PackageInfo", "org/apache/xbean/finder/AbstractFinder", "PackageInfo", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "path", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xbean/finder/AbstractFinder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/shade/commons/EmptyVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "path", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$Info;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/asm7/shade/commons/EmptyVisitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("package-info");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$PackageInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "javaName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$PackageInfo", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$ClassInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "javaName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "javaName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "path", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "access$702", "(Lorg/apache/xbean/finder/AbstractFinder$ClassInfo;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "getInterfaces", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "javaName", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder", "classInfos", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 12);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "javaName", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitAnnotation", "(Ljava/lang/String;Z)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$AnnotationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$AnnotationInfo", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/finder/AbstractFinder$Info", "getAnnotations", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$AnnotationInfo", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder", "getAnnotationInfos", "(Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$Info;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "annotationVisitor", "()Lorg/apache/xbean/asm7/AnnotationVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitField", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/xbean/asm7/FieldVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/finder/AbstractFinder$ClassInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$FieldInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$FieldInfo", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$ClassInfo;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "getFields", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$Info;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "fieldVisitor", "()Lorg/apache/xbean/asm7/FieldVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitMethod", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/xbean/asm7/MethodVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/finder/AbstractFinder$ClassInfo");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$MethodInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$MethodInfo", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$ClassInfo;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "getMethods", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$Info;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "methodVisitor", "()Lorg/apache/xbean/asm7/MethodVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visitMethodParameterAnnotation", "(ILjava/lang/String;Z)Lorg/apache/xbean/asm7/AnnotationVisitor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "info", "Lorg/apache/xbean/finder/AbstractFinder$Info;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/finder/AbstractFinder$MethodInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$MethodInfo", "getParameterAnnotations", "(I)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$AnnotationInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$AnnotationInfo", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "this$0", "Lorg/apache/xbean/finder/AbstractFinder;");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "<init>", "(Lorg/apache/xbean/finder/AbstractFinder;Lorg/apache/xbean/finder/AbstractFinder$Info;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$InfoBuildingVisitor", "annotationVisitor", "()Lorg/apache/xbean/asm7/AnnotationVisitor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
