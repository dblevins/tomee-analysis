package asm.org.eclipse.persistence.internal.cache;
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
public class Memoizer$KeyStorageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", "org/eclipse/persistence/internal/cache/Memoizer", "KeyStorage", ACC_PRIVATE);

classWriter.visitInnerClass("org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey", "org/eclipse/persistence/internal/cache/Memoizer", "MemoizerKey", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(0, "map", "Ljava/util/Map;", "Ljava/util/Map<Lorg/eclipse/persistence/internal/cache/Memoizer<TA;TV;>.MemoizerKey;Lorg/eclipse/persistence/internal/cache/Memoizer<TA;TV;>.MemoizerKey;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/cache/Memoizer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/eclipse/persistence/internal/cache/Memoizer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", "this$0", "Lorg/eclipse/persistence/internal/cache/Memoizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", "map", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Lorg/eclipse/persistence/internal/cache/ComputableTask;Ljava/lang/Object;)Lorg/eclipse/persistence/internal/cache/Memoizer$MemoizerKey;", "(Lorg/eclipse/persistence/internal/cache/ComputableTask<TA;TV;>;TA;)Lorg/eclipse/persistence/internal/cache/Memoizer<TA;TV;>.MemoizerKey;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", "this$0", "Lorg/eclipse/persistence/internal/cache/Memoizer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey", "<init>", "(Lorg/eclipse/persistence/internal/cache/Memoizer;Lorg/eclipse/persistence/internal/cache/ComputableTask;Ljava/lang/Object;Lorg/eclipse/persistence/internal/cache/Memoizer$MemoizerKey;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", "map", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "putIfAbsent", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey", "org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/internal/cache/Memoizer$MemoizerKey"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/eclipse/persistence/internal/cache/Memoizer;Lorg/eclipse/persistence/internal/cache/Memoizer$KeyStorage;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/cache/Memoizer$KeyStorage", "<init>", "(Lorg/eclipse/persistence/internal/cache/Memoizer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
