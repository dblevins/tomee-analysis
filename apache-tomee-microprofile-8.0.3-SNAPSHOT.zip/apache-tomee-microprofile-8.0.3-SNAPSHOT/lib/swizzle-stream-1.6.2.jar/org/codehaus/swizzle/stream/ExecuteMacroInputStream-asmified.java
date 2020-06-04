package asm.org.codehaus.swizzle.stream;
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
public class ExecuteMacroInputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/swizzle/stream/ExecuteMacroInputStream", null, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", null);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/ExecuteMacroInputStream$IncludeUrlMacro", "org/codehaus/swizzle/stream/ExecuteMacroInputStream", "IncludeUrlMacro", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/ExecuteMacroInputStream$IncludeFileMacro", "org/codehaus/swizzle/stream/ExecuteMacroInputStream", "IncludeFileMacro", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/ExecuteMacroInputStream$UnknownMacro", "org/codehaus/swizzle/stream/ExecuteMacroInputStream", "UnknownMacro", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/ExecuteMacroInputStream$Macro", "org/codehaus/swizzle/stream/ExecuteMacroInputStream", "Macro", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/codehaus/swizzle/stream/ExecuteMacroInputStream$MacroLibrary", "org/codehaus/swizzle/stream/ExecuteMacroInputStream", "MacroLibrary", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "org/codehaus/swizzle/stream/ExecuteMacroInputStream$MacroLibrary");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/ExecuteMacroInputStream$MacroLibrary", "<init>", "(Ljava/util/Map;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/swizzle/stream/DelimitedTokenReplacementInputStream", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;Lorg/codehaus/swizzle/stream/StreamTokenHandler;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
