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
public class ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "Ljava/lang/Object;Ljava/lang/Comparable<Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement;>;", "java/lang/Object", new String[] { "java/lang/Comparable" });

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "com/sun/faces/application/ConverterPropertyEditorFactory", "ClassTemplateInfo", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "Utf8InfoRef", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "Utf8InfoReplacement", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "ref", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "replacement", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "ref", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "access$000", "(Ljava/lang/String;)[B", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "replacement", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compareTo", "(Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "ref", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "ref", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoRef", "index", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "compareTo", "(Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement", "compareTo", "(Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo$Utf8InfoReplacement;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
