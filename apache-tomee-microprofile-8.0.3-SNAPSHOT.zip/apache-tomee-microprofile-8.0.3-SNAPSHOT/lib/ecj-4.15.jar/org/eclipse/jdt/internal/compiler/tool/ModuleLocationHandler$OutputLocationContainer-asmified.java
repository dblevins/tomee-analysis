package asm.org.eclipse.jdt.internal.compiler.tool;
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
public class ModuleLocationHandler$OutputLocationContainerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$OutputLocationContainer", null, "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$LocationContainer", null);

classWriter.visitInnerClass("javax/tools/JavaFileManager$Location", "javax/tools/JavaFileManager", "Location", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$LocationContainer", "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler", "LocationContainer", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$LocationWrapper", "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler", "LocationWrapper", 0);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$OutputLocationContainer", "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler", "OutputLocationContainer", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$OutputLocationContainer", "this$0", "Lorg/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$LocationContainer", "<init>", "(Lorg/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler;Ljavax/tools/JavaFileManager$Location;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "put", "(Ljava/lang/String;Lorg/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$LocationWrapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$OutputLocationContainer", "locationNames", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "put", "(Ljava/nio/file/Path;Lorg/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$LocationWrapper;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/jdt/internal/compiler/tool/ModuleLocationHandler$OutputLocationContainer", "locationPaths", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
