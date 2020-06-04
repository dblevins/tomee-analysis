package asm.com.sun.faces.application;
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
public class ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRefDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "com/sun/faces/application/ConverterPropertyEditorFactory", "ClassTemplateInfo", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "Utf8InfoRef", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "length", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(II)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", "length", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
