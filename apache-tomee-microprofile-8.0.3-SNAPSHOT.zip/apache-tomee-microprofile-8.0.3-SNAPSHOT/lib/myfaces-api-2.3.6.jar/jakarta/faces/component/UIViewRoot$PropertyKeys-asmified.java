package asm.jakarta.faces.component;
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
public class UIViewRoot$PropertyKeysDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/faces/component/UIViewRoot$PropertyKeys", "Ljava/lang/Enum<Ljakarta/faces/component/UIViewRoot$PropertyKeys;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/faces/component/UIViewRoot$PropertyKeys", "jakarta/faces/component/UIViewRoot", "PropertyKeys", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "afterPhaseListener", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "beforePhaseListener", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "phaseListeners", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "locale", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "renderKitId", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "viewId", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "uniqueIdCounter", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "resourceDependencyUniqueIdCounter", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "$VALUES", "[Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/faces/component/UIViewRoot$PropertyKeys;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/faces/component/UIViewRoot$PropertyKeys;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/component/UIViewRoot$PropertyKeys;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("afterPhaseListener");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "afterPhaseListener", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("beforePhaseListener");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "beforePhaseListener", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("phaseListeners");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "phaseListeners", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("locale");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "locale", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("renderKitId");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "renderKitId", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("viewId");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "viewId", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("uniqueIdCounter");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "uniqueIdCounter", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("resourceDependencyUniqueIdCounter");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/UIViewRoot$PropertyKeys", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "resourceDependencyUniqueIdCounter", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/faces/component/UIViewRoot$PropertyKeys");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "afterPhaseListener", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "beforePhaseListener", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "phaseListeners", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "locale", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "renderKitId", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "viewId", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "uniqueIdCounter", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "resourceDependencyUniqueIdCounter", "Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/UIViewRoot$PropertyKeys", "$VALUES", "[Ljakarta/faces/component/UIViewRoot$PropertyKeys;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
