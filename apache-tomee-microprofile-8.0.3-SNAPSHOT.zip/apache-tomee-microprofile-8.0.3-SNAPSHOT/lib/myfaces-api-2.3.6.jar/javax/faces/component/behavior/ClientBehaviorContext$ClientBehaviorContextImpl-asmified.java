package asm.javax.faces.component.behavior;
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
public class ClientBehaviorContext$ClientBehaviorContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", null, "javax/faces/component/behavior/ClientBehaviorContext", null);

classWriter.visitInnerClass("javax/faces/component/behavior/ClientBehaviorContext$Parameter", "javax/faces/component/behavior/ClientBehaviorContext", "Parameter", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "javax/faces/component/behavior/ClientBehaviorContext", "ClientBehaviorContextImpl", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_facesContext", "Ljavax/faces/context/FacesContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_component", "Ljavax/faces/component/UIComponent;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_eventName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_sourceId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_parameters", "Ljava/util/Collection;", "Ljava/util/Collection<Ljavax/faces/component/behavior/ClientBehaviorContext$Parameter;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V", "(Ljavax/faces/context/FacesContext;Ljavax/faces/component/UIComponent;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection<Ljavax/faces/component/behavior/ClientBehaviorContext$Parameter;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/faces/component/behavior/ClientBehaviorContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_facesContext", "Ljavax/faces/context/FacesContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_component", "Ljavax/faces/component/UIComponent;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_eventName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_sourceId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_parameters", "Ljava/util/Collection;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getComponent", "()Ljavax/faces/component/UIComponent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_component", "Ljavax/faces/component/UIComponent;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEventName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_eventName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFacesContext", "()Ljavax/faces/context/FacesContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_facesContext", "Ljavax/faces/context/FacesContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameters", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljavax/faces/component/behavior/ClientBehaviorContext$Parameter;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_parameters", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSourceId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/faces/component/behavior/ClientBehaviorContext$ClientBehaviorContextImpl", "_sourceId", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
