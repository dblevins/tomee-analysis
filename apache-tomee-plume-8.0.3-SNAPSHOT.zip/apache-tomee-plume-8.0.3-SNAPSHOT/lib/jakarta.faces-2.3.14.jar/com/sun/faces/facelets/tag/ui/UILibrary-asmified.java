package asm.com.sun.faces.facelets.tag.ui;
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
public class UILibraryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/ui/UILibrary", null, "com/sun/faces/facelets/tag/AbstractTagLibrary", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Namespace", "Ljava/lang/String;", null, "http://java.sun.com/jsf/facelets");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLNSNamespace", "Ljava/lang/String;", null, "http://xmlns.jcp.org/jsf/facelets");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Instance", "Lcom/sun/faces/facelets/tag/ui/UILibrary;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://java.sun.com/jsf/facelets");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/ui/UILibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/AbstractTagLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("include");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/IncludeHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("composition");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/CompositionHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("component");
methodVisitor.visitLdcInsn("facelets.ui.ComponentRef");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/ComponentRefHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("fragment");
methodVisitor.visitLdcInsn("facelets.ui.ComponentRef");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/ComponentRefHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("define");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/DefineHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("insert");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/InsertHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("param");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/ParamHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("decorate");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/DecorateHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("repeat");
methodVisitor.visitLdcInsn("facelets.ui.Repeat");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/ui/RepeatHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("debug");
methodVisitor.visitLdcInsn("facelets.ui.Debug");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/ui/UILibrary", "addComponent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/facelets/tag/ui/UILibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/ui/UILibrary", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/facelets/tag/ui/UILibrary", "Instance", "Lcom/sun/faces/facelets/tag/ui/UILibrary;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
