package asm.com.sun.faces.facelets.tag.jstl.core;
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
public class JstlCoreLibraryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", null, "com/sun/faces/facelets/tag/AbstractTagLibrary", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Namespace", "Ljava/lang/String;", null, "http://java.sun.com/jsp/jstl/core");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IncorrectNamespace", "Ljava/lang/String;", null, "http://java.sun.com/jstl/core");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XMLNSNamespace", "Ljava/lang/String;", null, "http://xmlns.jcp.org/jsp/jstl/core");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://java.sun.com/jsp/jstl/core");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/AbstractTagLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("if");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/IfHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("forEach");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ForEachHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("catch");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/CatchHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("choose");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ChooseHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("when");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ChooseWhenHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("otherwise");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ChooseOtherwiseHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("set");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/SetHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/facelets/tag/AbstractTagLibrary", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("if");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/IfHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("forEach");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ForEachHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("catch");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/CatchHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("choose");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ChooseHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("when");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ChooseWhenHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("otherwise");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/ChooseOtherwiseHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("set");
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/faces/facelets/tag/jstl/core/SetHandler;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/facelets/tag/jstl/core/JstlCoreLibrary", "addTagHandler", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
